package com.myproyect.demo.app.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproyect.demo.app.data.PermisoAcceso;
import com.myproyect.demo.app.interfaceService.IPermisoAccesoService;

@Controller
@RequestMapping
public class ControladorPermisoAcceso {
	
	@Autowired
	private IPermisoAccesoService service;
	
	@GetMapping("/listarPermisoAcceso")
	public String listar(Model model) {		
		List<PermisoAcceso>permisoAcceso=service.Listar();
		model.addAttribute("permisoAcceso", permisoAcceso);
		return "index";
		
	}
	
	@GetMapping("/newPermisoAcceso")
	public String agregar(Model model) {
		model.addAttribute("permisoAcceso", new PermisoAcceso());
		return "form";
	}
	
	@PostMapping("/savePermisoAcceso")
	public String save(@Validated PermisoAcceso peac, Model model) {
		service.save(peac);
		return "redirect:listar";
		
	}
	
	@GetMapping("/editarPermisoAcceso/{idPermiso}")
	public String editar(@PathVariable int idPermiso, Model model) {
		Optional<PermisoAcceso>permisoAcceso=service.ListarId(idPermiso);
		model.addAttribute("permisoAcceso", permisoAcceso);
		return "form";
	}
	
	@GetMapping("/eliminarPermisoAcceso/{idPermiso}")
	public String delete(Model model, @PathVariable int idPermiso) {
		service.delete(idPermiso);
		return "redirect:listar";
	}

}
