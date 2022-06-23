package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Solicitudes;
import com.myproyect.demo.app.interfaceService.ISolicitudesService;
import com.myproyect.demo.app.repository.ISolicitudes;

@Service
public class SolicitudesService implements ISolicitudesService {

	@Autowired
	private ISolicitudes data;
	
	@Override
	public List<Solicitudes> Listar() {
		
		return (List<Solicitudes>)data.findAll();
	}

	@Override
	public Optional<Solicitudes> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Solicitudes sol) {
		int res=0;
		Solicitudes solicitudes=data.save(sol);
		if (!solicitudes.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
