package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Inscripcion;
import com.myproyect.demo.app.interfaceService.IInscripcionService;
import com.myproyect.demo.app.repository.IInscripcion;

@Service
public class InscripcionService implements IInscripcionService {

	@Autowired
	private IInscripcion data;
	
	@Override
	public List<Inscripcion> Listar() {
		
		return (List<Inscripcion>)data.findAll();
	}

	@Override
	public Optional<Inscripcion> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Inscripcion ins) {
		int res=0;
		Inscripcion inscripcion=data.save(ins);
		if (!inscripcion.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
