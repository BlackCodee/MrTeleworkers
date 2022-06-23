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

import com.myproyect.demo.app.data.Rol;
import com.myproyect.demo.app.interfaceService.IRolService;

@Controller
@RequestMapping
public class ControladorRol {
	
	@Autowired
	private IRolService service;
	
	@GetMapping("/listarRol")
	public String listar(Model model) {		
		List<Rol>rol=service.Listar();
		model.addAttribute("rol", rol);
		return "index";
		
	}
	
	@GetMapping("/newRol")
	public String agregar(Model model) {
		model.addAttribute("rol", new Rol());
		return "form";
	}
	
	@PostMapping("/saveRol")
	public String save(@Validated Rol ro, Model model) {
		service.save(ro);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editarRol/{idRol}")
	public String editar(@PathVariable int idRol, Model model) {
		Optional<Rol>rol=service.ListarId(idRol);
		model.addAttribute("rol", rol);
		return "form";
	}
	
	@GetMapping("/eliminarRol/{idRol}")
	public String delete(Model model, @PathVariable int idRol) {
		service.delete(idRol);
		return "redirect:/listar";
	}
	
}
