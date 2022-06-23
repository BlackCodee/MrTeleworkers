package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Inscripcion;

public interface IInscripcionService{
	public List<Inscripcion>Listar();
	public Optional<Inscripcion>ListarId(int id);
	public int save(Inscripcion ins);
	public void delete(int id);
}
