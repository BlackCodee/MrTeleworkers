package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.ActividadLaboral;
public interface IActividadLaboralService{
	public List<ActividadLaboral>Listar();
	public Optional<ActividadLaboral>ListarId(int id);
	public int save(ActividadLaboral al);
	public void delete(int id);
}
