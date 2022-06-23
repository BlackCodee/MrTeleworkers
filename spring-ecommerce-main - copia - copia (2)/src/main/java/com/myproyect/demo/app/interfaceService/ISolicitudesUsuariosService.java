package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.SolicitudesUsuarios;

public interface ISolicitudesUsuariosService{
	public List<SolicitudesUsuarios>Listar();
	public Optional<SolicitudesUsuarios>ListarId(int id);
	public int save(SolicitudesUsuarios soliusu);
	public void delete(int id);
}
