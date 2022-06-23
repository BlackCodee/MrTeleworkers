package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Insumos;
import com.myproyect.demo.app.interfaceService.IInsumosService;
import com.myproyect.demo.app.repository.IInsumos;

@Service
public class InsumosService implements IInsumosService {

	@Autowired
	private IInsumos data;
	
	@Override
	public List<Insumos> Listar() {
		
		return (List<Insumos>)data.findAll();
	}

	@Override
	public Optional<Insumos> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Insumos insu) {
		int res=0;
		Insumos insumos=data.save(insu);
		if (!insumos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
