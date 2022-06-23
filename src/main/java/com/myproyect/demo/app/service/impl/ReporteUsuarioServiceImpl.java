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
import com.myproyect.demo.app.model.ReporteUsuariosDTO;
import com.myproyect.demo.app.service.api.ReporteUsuariosServiceAPI;

import net.sf.jasperreports.engine.JRException;

@Service
public class ReporteUsuarioServiceImpl implements ReporteUsuariosServiceAPI{

	@Autowired JasperReportManager reportManager;
	
	@Autowired
	private DataSource dataSource;

	@Override
	public ReporteUsuariosDTO obtenerReporteUsuarios(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		
		String fileName = "reporte_usuarios";
		ReporteUsuariosDTO dto = new ReporteUsuariosDTO();
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
