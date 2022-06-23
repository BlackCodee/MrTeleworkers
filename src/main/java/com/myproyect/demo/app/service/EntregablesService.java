package com.myproyect.demo.app.service;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Entregables;
import com.myproyect.demo.app.interfaceService.IEntregablesService;
import com.myproyect.demo.app.repository.IEntregables;

@Service
public class EntregablesService implements IEntregablesService {

	@Autowired
	private IEntregables data;
	
	@Override
	public List<Entregables> Listar() {
		
		return (List<Entregables>)data.findAll();
	}


	@Override
	public int save(Entregables ent) {
		int res=0;
		Entregables entregables=data.save(ent);
		if (!entregables.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}


	@Override
	public int guardarEntregable(Entregables ent) {
		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalDate fecha = LocalDate.now();
		Date fechaActual = Date.from(fecha.atStartOfDay(defaultZoneId).toInstant());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String Hora = dtf.format(LocalDateTime.now());
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Date horaActual = formato.parse(Hora);
		ent.setFechaEntrega(fechaActual);
		//ent.setHoraEntrega(horaActual);
		ent.setIdUsuario(null);
		int res=0;
		Entregables entregables=data.save(ent);
		if (!entregables.equals(null)) {
			res=1;
		}
		return res;
	}
	

}
