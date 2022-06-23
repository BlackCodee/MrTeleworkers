package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.SolicitudesUsuarios;
import com.myproyect.demo.app.interfaceService.ISolicitudesUsuariosService;
import com.myproyect.demo.app.repository.ISolicitudesUsuarios;

@Service
public class SolicitudesUsuariosService implements ISolicitudesUsuariosService {

	@Autowired
	private ISolicitudesUsuarios data;
	
	@Override
	public List<SolicitudesUsuarios> Listar() {
		
		return (List<SolicitudesUsuarios>)data.findAll();
	}

	@Override
	public Optional<SolicitudesUsuarios> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(SolicitudesUsuarios soliusu) {
		int res=0;
		SolicitudesUsuarios solicitudesUsuarios=data.save(soliusu);
		if (!solicitudesUsuarios.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
