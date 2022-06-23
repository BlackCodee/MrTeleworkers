package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Agentes;

public interface IAgentesService {
	public List<Agentes>Listar();
	public Optional<Agentes>ListarId(int id);
	public int save(Agentes ag);
	public void delete(int id);
}
