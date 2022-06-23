package com.myproyect.demo.app.security;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.repository.IUsuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuario usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario saveUsu(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	@Override
	public List<Usuario> Listar() {
		
		return (List<Usuario>)usuarioRepository.findAll();
	}


	@Override
	public int save(Usuario usu) {
		int res=0;
		Usuario usuario=usuarioRepository.save(usu);
		if (!usuario.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		usuarioRepository.deleteById(id);
		
	}


	/*
	@Override
	public Usuario ListarId(int id) {
		// TODO Auto-generated method stub
		return data.findId(id);
	}
	*/
	
	@Override
	public Optional<Usuario> ListarById(int id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> saveAll(List<Usuario> listUsuario) {
		
		return this.saveAll(listUsuario);
	}
	/*
	@Override
	public Usuario ListarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	
}
