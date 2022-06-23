package com.myproyect.demo.app.service.api;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.myproyect.demo.app.model.ReporteActividadDTO;

import net.sf.jasperreports.engine.JRException;

public interface ReporteActividadServiceAPI {

	ReporteActividadDTO obtenerReporteActividades(Map<String, Object> params) throws JRException, IOException, SQLException;
}
