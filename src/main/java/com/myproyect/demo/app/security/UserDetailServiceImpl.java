package com.myproyect.demo.app.security;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
/*import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;*/
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Usuario;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private IUsuarioService usuarioService;
	
	/*
	@Autowired
	private BCryptPasswordEncoder bCrypt;
	*/
	
	@Autowired
	HttpSession session;
	
	private Logger log = LoggerFactory.getLogger(UserDetailServiceImpl.class);

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("Este es el username");
		Optional<Usuario> optionalUser=usuarioService.findByEmail(username);
		if (optionalUser.isPresent()) {
			log.info("Esto es el id del usuario: {}", optionalUser.get().getIdUsuario());
			session.setAttribute("idusuario", optionalUser.get().getIdUsuario());
			Usuario usuario= optionalUser.get();
			return User.builder().username(usuario.getNombre()).password(usuario.getPassword()).roles(usuario.getIdRol().getNomRol()).build();
		}else {
			throw new UsernameNotFoundException("Usuario no encontrado");			
		}
	}

}
