package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.PermisoAcceso;

public interface IPermisoAccesoService{
	public List<PermisoAcceso>Listar();
	public Optional<PermisoAcceso>ListarId(int id);
	public int save(PermisoAcceso peac);
	public void delete(int id);
}
