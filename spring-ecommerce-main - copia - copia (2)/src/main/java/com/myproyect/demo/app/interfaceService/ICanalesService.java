package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Canales;

public interface ICanalesService{
	public List<Canales>Listar();
	public Optional<Canales>ListarId(int id);
	public int save(Canales can);
	public void delete(int id);
}
