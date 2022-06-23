package com.myproyect.demo.app.service;

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
	public Optional<Entregables> ListarId(int id) {
		
		return data.findById(id);
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
	

}
