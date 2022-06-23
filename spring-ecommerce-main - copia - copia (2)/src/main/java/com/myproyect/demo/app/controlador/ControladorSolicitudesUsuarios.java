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

import com.myproyect.demo.app.data.SolicitudesUsuarios;
import com.myproyect.demo.app.interfaceService.ISolicitudesUsuariosService;

@Controller
@RequestMapping
public class ControladorSolicitudesUsuarios {
	
	@Autowired
	private ISolicitudesUsuariosService service;
	
	@GetMapping("")
	public String listar(Model model) {		
		List<SolicitudesUsuarios>solicitudesUsuarios=service.Listar();
		model.addAttribute("solicitudesUsuarios", solicitudesUsuarios);
		return "";
		
	}
	
	@GetMapping("/newSolicitudesUsuarios")
	public String agregar(Model model) {
		model.addAttribute("solicitudesUsuarios", new SolicitudesUsuarios());
		return "form";
	}
	
	@PostMapping("/saveSolicitudesUsuarios")
	public String save(@Validated SolicitudesUsuarios soliusu, Model model) {
		service.save(soliusu);
		return "";
		
	}
	
	@GetMapping("/editarSolicitudesUsuarios/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<SolicitudesUsuarios>solicitudesUsuarios=service.ListarId(id);
		model.addAttribute("solicitudesUsuarios", solicitudesUsuarios);
		return "form";
	}
	
	@GetMapping("/eliminarSolicitudesUsuarios/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
}
