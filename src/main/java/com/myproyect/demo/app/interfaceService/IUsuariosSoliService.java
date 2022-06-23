package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.UsuariosSoli;

public interface IUsuariosSoliService {
	public List<UsuariosSoli>Listar();
	public Optional<UsuariosSoli>ListarId(int id);
	public int save(UsuariosSoli ususoli);
	public void delete(int id);
}
