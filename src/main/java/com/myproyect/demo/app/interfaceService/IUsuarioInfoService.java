package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.UsuarioInfo;



public interface IUsuarioInfoService {
	
	public List<UsuarioInfo>Listar();
	public Optional<UsuarioInfo>ListarId(int idusu);
	public int save(UsuarioInfo ui);
	public void delete(int idusu);

}
