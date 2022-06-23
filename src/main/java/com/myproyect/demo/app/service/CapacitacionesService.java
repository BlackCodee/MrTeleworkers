package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Capacitaciones;
import com.myproyect.demo.app.interfaceService.ICapacitacionesService;
import com.myproyect.demo.app.repository.ICapacitaciones;

@Service
public class CapacitacionesService implements ICapacitacionesService {

	@Autowired
	private ICapacitaciones data;
	
	@Override
	public List<Capacitaciones> Listar() {
		
		return (List<Capacitaciones>)data.findAll();
	}

	@Override
	public Optional<Capacitaciones> ListarId(int idCapacitacion) {
		
		return data.findById(idCapacitacion);
	}

	@Override
	public int save(Capacitaciones capa) {
		int res=0;
		Capacitaciones capacitaciones=data.save(capa);
		if (!capacitaciones.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
