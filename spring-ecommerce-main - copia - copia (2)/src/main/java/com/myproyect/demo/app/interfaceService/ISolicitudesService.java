package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Solicitudes;

public interface ISolicitudesService{
	public List<Solicitudes>Listar();
	public Optional<Solicitudes>ListarId(int id);
	public int save(Solicitudes sol);
	public void delete(int id);
}
