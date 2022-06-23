package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Rol;
import com.myproyect.demo.app.interfaceService.IRolService;
import com.myproyect.demo.app.repository.IRol;

@Service
public class RolService implements IRolService {

	@Autowired
	private IRol data;
	
	@Override
	public List<Rol> Listar() {
		
		return (List<Rol>)data.findAll();
	}

	@Override
	public Optional<Rol> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Rol ro) {
		int res=0;
		Rol rol=data.save(ro);
		if (!rol.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}

	@Override
	public Rol ListarById(int id) {
		// TODO Auto-generated method stub
		return data.findId(id);
	}
	

}
