package com.myproyect.demo.app.controlador;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.repository.IUsuario;
import com.myproyect.demo.app.security.IUsuarioService;

@Controller
@RequestMapping
public class ControladorUsuario {
	
	@Autowired
	private IUsuarioService service;

	@Autowired
	private IUsuario iUsuario;
	
	BCryptPasswordEncoder passEncode= new BCryptPasswordEncoder();
	
	@GetMapping("/listarUsuario")
	public String listar(Model model) {
		List<Usuario>usuario=service.Listar();
		model.addAttribute("usuario", usuario);
		return "Seguimiento/Administrador/Usuarios-vista-Administrador";
		
	}
	
	@GetMapping("/newUsuario")
	public String agregar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "Seguimiento/Administrador/Crear-Usuario";
	}
	
	@PostMapping("/saveUsuario")
	public String save(@Validated Usuario usu, Model model) {
		Date fecha = new Date();
		usu.setPassword( passEncode.encode(usu.getPassword()));
		usu.setEstado("activo");
		usu.setFechaIngreso(fecha);
		service.save(usu);
		return "redirect:listarUsuario";
		
	}
	
	@GetMapping("/editarUsuario/{idUsuario}")
	public String editar(@PathVariable int idUsuario, Model model) {
		Usuario usu = iUsuario.findId(idUsuario);
		model.addAttribute("usuario", usu);
		return "Seguimiento/Administrador/editarUsuarios";
	}
	
	@GetMapping("/eliminarUsuario/{idUsuario}")
	public String delete(Model model, @PathVariable int idUsuario) {
		service.delete(idUsuario);
		return "redirect:listarUsuario";
	}
	
	@RequestMapping("/estadoUsuario")
    public String estadoActividad(
    @RequestParam(name = "idUsuario", defaultValue = "0") Integer idUsuario) {
		Usuario aux = iUsuario.findById(idUsuario).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iUsuario.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iUsuario.save(aux);
        }
         return "redirect:listarUsuario";
    }
	
}
