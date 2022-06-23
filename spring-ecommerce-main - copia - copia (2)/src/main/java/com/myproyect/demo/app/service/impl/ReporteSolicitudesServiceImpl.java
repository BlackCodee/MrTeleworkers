package com.myproyect.demo.app.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.commons.JasperReportManager;
import com.myproyect.demo.app.enums.TipoReporteEnum;
import com.myproyect.demo.app.model.ReporteSolicitudesDTO;
import com.myproyect.demo.app.service.api.ReporteSolicitudesServiceAPI;

import net.sf.jasperreports.engine.JRException;


@Service
public class ReporteSolicitudesServiceImpl implements ReporteSolicitudesServiceAPI {
	
	@Autowired
	private JasperReportManager reportManager;

	@Autowired
	private DataSource dataSource;

	 
	@Override
	public ReporteSolicitudesDTO obtenerReporteSolicitudes(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "Reporte_solicitudes";
		ReporteSolicitudesDTO dto = new ReporteSolicitudesDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}

}
