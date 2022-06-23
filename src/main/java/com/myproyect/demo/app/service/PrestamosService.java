package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Prestamos;
import com.myproyect.demo.app.interfaceService.IPrestamosService;
import com.myproyect.demo.app.repository.IPrestamos;

@Service
public class PrestamosService implements IPrestamosService {

	@Autowired
	private IPrestamos data;
	
	@Override
	public List<Prestamos> Listar() {
		
		return (List<Prestamos>)data.findAll();
	}

	@Override
	public Optional<Prestamos> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Prestamos pres) {
		int res=0;
		Prestamos prestamos=data.save(pres);
		if (!prestamos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
