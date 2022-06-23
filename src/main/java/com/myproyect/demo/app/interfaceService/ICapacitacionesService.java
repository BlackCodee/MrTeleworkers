package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Capacitaciones;

public interface ICapacitacionesService{
	public List<Capacitaciones>Listar();
	public Optional<Capacitaciones>ListarId(int idCapacitacion);
	public int save(Capacitaciones capa);
	public void delete(int id);
}
