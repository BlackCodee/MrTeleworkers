package com.myproyect.demo.app.service.api;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.model.ReporteComputadorDTO;

import net.sf.jasperreports.engine.JRException;

@Service
@Repository
public interface ReporteComputadorServiceAPI {
	ReporteComputadorDTO obtenerReporteComputador(Map<String, Object> params)
			throws JRException, IOException, SQLException;
}
