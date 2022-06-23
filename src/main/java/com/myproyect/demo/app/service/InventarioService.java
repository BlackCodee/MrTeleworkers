package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Inventarios;
import com.myproyect.demo.app.interfaceService.IInventariosService;
import com.myproyect.demo.app.repository.IInventarios;

@Service
public class InventarioService implements IInventariosService {

	@Autowired
	private IInventarios data;
	
	@Override
	public List<Inventarios> Listar() {
		
		return (List<Inventarios>)data.findAll();
	}

	@Override
	public Optional<Inventarios> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Inventarios inve) {
		int res=0;
		Inventarios inventarios=data.save(inve);
		if (!inventarios.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
