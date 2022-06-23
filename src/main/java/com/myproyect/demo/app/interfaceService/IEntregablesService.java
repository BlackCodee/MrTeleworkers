package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Entregables;

public interface IEntregablesService{
	public List<Entregables>Listar();
	public int save(Entregables ent);
	public void delete(int id);
	public int guardarEntregable(Entregables ent);
}
