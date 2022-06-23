package com.myproyect.demo.app.security;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Usuario;

public interface IUsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario saveUsu (Usuario usuario);
	Optional<Usuario> findByEmail(String email);
	/*---------------------------------*/
	public List<Usuario>Listar();
	public Optional<Usuario>ListarById(int id);
	/*public Usuario ListarId(int id);*/
	public int save(Usuario usu);
	public List<Usuario> saveAll(List<Usuario> listUsuario);
	public void delete(int id);
}
