package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Computador;
import com.myproyect.demo.app.interfaceService.IComputadorService;
import com.myproyect.demo.app.repository.IComputador;

@Service
public class ComputadorService implements IComputadorService {

	@Autowired
	private IComputador data;
	
	@Override
	public List<Computador> Listar() {
		
		return (List<Computador>)data.findAll();
	}

	@Override
	public Optional<Computador> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Computador com) {
		int res=0;
		Computador computador=data.save(com);
		if (!computador.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
