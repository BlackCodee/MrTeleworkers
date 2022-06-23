package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.PermisoAcceso;
import com.myproyect.demo.app.interfaceService.IPermisoAccesoService;
import com.myproyect.demo.app.repository.IPermisoAcceso;

@Service
public class PermisoAccesoService implements IPermisoAccesoService {

	@Autowired
	private IPermisoAcceso data;
	
	@Override
	public List<PermisoAcceso> Listar() {
		
		return (List<PermisoAcceso>)data.findAll();
	}

	@Override
	public Optional<PermisoAcceso> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(PermisoAcceso peac) {
		int res=0;
		PermisoAcceso permisoAcceso=data.save(peac);
		if (!permisoAcceso.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
