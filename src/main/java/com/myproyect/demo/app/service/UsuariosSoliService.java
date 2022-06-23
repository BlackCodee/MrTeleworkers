package com.myproyect.demo.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.UsuariosSoli;
import com.myproyect.demo.app.interfaceService.IUsuariosSoliService;
import com.myproyect.demo.app.repository.IUsuariosSoli;

@Service
public class UsuariosSoliService implements IUsuariosSoliService  {
	
	
	@Autowired
	private IUsuariosSoli data;

	@Override
	public List<UsuariosSoli> Listar() {
		
		return (List<UsuariosSoli>)data.findAll();
	}

	@Override
	public Optional<UsuariosSoli> ListarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(UsuariosSoli ususoli) {
		int res=0;
		UsuariosSoli usuariosSoli=data.save(ususoli);
		if (!usuariosSoli.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
