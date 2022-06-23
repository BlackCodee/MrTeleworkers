package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Insumos;

public interface IInsumosService{
	public List<Insumos>Listar();
	public Optional<Insumos>ListarId(int id);
	public int save(Insumos insu);
	public void delete(int id);
}
