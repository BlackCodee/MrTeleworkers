package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.UsuarioInfo;
import com.myproyect.demo.app.interfaceService.IUsuarioInfoService;
import com.myproyect.demo.app.repository.IUsuarioInfo;

@Service
public class UsuarioInfoService implements IUsuarioInfoService {
	
	@Autowired
	private IUsuarioInfo data;

	@Override
	public List<UsuarioInfo> Listar() {
		
		return (List<UsuarioInfo>)data.findAll();
	}

	@Override
	public Optional<UsuarioInfo> ListarId(int idusu) {
		return data.findById(idusu);
	}

	@Override
	public int save(UsuarioInfo ui) {
		int res=0;
		UsuarioInfo usuarioInfo=data.save(ui);
		if (!usuarioInfo.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idusu) {
		data.deleteById(idusu);
		
	}

}
