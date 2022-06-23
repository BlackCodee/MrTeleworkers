package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Computador;

public interface IComputadorService{
	public List<Computador>Listar();
	public Optional<Computador>ListarId(int id);
	public int save(Computador com);
	public void delete(int id);
}
