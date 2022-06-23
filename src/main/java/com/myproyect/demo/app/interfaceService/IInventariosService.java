package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Inventarios;

public interface IInventariosService{
	public List<Inventarios>Listar();
	public Optional<Inventarios>ListarId(int id);
	public int save(Inventarios inve);
	public void delete(int id);
}
