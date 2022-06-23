package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Rol;

public interface IRolService{
	public List<Rol>Listar();
	public Optional<Rol>ListarId(int id);
	public Rol ListarById(int id);
	public int save(Rol ro);
	public void delete(int id);
}
