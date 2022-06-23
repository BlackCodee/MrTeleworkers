package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Calendario;

public interface ICalendarioService{
	public List<Calendario>Listar();
	public Optional<Calendario>ListarId(int id);
	public int save(Calendario cal);
	public void delete(int id);
}
