package com.myproyect.demo.app.service.api;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.myproyect.demo.app.model.ReporteUsuariosDTO;

import net.sf.jasperreports.engine.JRException;

public interface ReporteUsuariosServiceAPI {
	
	ReporteUsuariosDTO obtenerReporteUsuarios(Map<String, Object> params) throws JRException, IOException, SQLException;
}
