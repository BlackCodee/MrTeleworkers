package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.ActividadLaboral;
import com.myproyect.demo.app.interfaceService.IActividadLaboralService;
import com.myproyect.demo.app.repository.IActividadLaboral;

@Service
public class ActividadLaboralService implements IActividadLaboralService {

	@Autowired
	private IActividadLaboral data;
	
	@Override
	public List<ActividadLaboral> Listar() {
		
		return (List<ActividadLaboral>)data.findAll();
	}

	@Override
	public Optional<ActividadLaboral> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(ActividadLaboral al) {
		int res=0;
		ActividadLaboral actividadLaboral=data.save(al);
		if (!actividadLaboral.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
