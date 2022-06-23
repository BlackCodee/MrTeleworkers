package com.myproyect.demo.app.controlador;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.security.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {
	
	private final Logger logger= LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private IUsuarioService usuarioService;
	
	
	BCryptPasswordEncoder passEncode= new BCryptPasswordEncoder();
	
	
	@GetMapping("/login")
	public String login() {
		return "usuario/login";
	}
	
	@GetMapping("/acceder")
	public String acceder(Usuario usuario, HttpSession session) {
		logger.info("Accesos : {}", usuario);
		
		Optional<Usuario> user=usuarioService.findById(Integer.parseInt(session.getAttribute("idusuario").toString()));
		
		
		if (user.isPresent()) {
			session.setAttribute("idusuario", user.get().getIdUsuario());
			
			if (user.get().getIdRol().getNomRol().equals("ADMINISTRADOR")) {
				return "redirect:dashboard-Admin";
			}
			else if (user.get().getIdRol().getNomRol().equals("EMPLEADO")) {
				return "redirect:dashboard-Empleado";
			}
			else if (user.get().getIdRol().getNomRol().equals("JEFE DE AREA")) {
				return "redirect:dashboard-Jefe";
			}
			else if (user.get().getIdRol().getNomRol().equals("AGENTE TECNICO")) {
				return "redirect:dashboard-Agentes";
			}
			else {
				return "redirect:";
			}
		}else {
			logger.info("Usuario no existe");
		}
		
		return "redirect:";
	}

	
	@GetMapping("/cerrar")
	public String cerrarSesion( HttpSession session ) {
		session.removeAttribute("idusuario");
		return "redirect:";
	}
}
