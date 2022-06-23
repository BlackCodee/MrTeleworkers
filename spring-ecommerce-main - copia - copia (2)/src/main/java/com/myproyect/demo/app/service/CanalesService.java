package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Canales;
import com.myproyect.demo.app.interfaceService.ICanalesService;
import com.myproyect.demo.app.repository.ICanales;

@Service
public class CanalesService implements ICanalesService {

	@Autowired
	private ICanales data;
	
	@Override
	public List<Canales> Listar() {
		
		return (List<Canales>)data.findAll();
	}

	@Override
	public Optional<Canales> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Canales can) {
		int res=0;
		Canales canales=data.save(can);
		if (!canales.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
