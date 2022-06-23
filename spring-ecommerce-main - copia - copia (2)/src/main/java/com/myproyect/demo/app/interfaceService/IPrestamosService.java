package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Prestamos;

public interface IPrestamosService{
	public List<Prestamos>Listar();
	public Optional<Prestamos>ListarId(int id);
	public int save(Prestamos pres);
	public void delete(int id);
}
