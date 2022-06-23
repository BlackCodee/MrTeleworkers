package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Proveedor;

public interface IProveedorService{
	public List<Proveedor>Listar();
	public Optional<Proveedor>ListarId(int id);
	public int save(Proveedor prov);
	public void delete(int id);
}
