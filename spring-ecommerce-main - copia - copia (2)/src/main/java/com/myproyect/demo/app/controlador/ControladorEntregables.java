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

import com.myproyect.demo.app.data.Entregables;
import com.myproyect.demo.app.interfaceService.IEntregablesService;

@Controller
@RequestMapping
public class ControladorEntregables {
	
	@Autowired
	private IEntregablesService service;
	
	@GetMapping("/listarEntregables")
	public String listar(Model model) {		
		List<Entregables>entregables=service.Listar();
		model.addAttribute("entregables", entregables);
		return "index";
		
	}
	
	@GetMapping("/newEntregables")
	public String agregar(Model model) {
		model.addAttribute("entregables", new Entregables());
		return "form";
	}
	
	@PostMapping("/saveEntregables")
	public String save(@Validated Entregables ent, Model model) {
		service.save(ent);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editarEntregables/{idEntregables}")
	public String editar(@PathVariable int idEntregables, Model model) {
		Optional<Entregables>entregables=service.ListarId(idEntregables);
		model.addAttribute("entregables", entregables);
		return "form";
	}
	
	@GetMapping("/eliminarEntregables/{idEntregables}")
	public String delete(Model model, @PathVariable int idEntregables) {
		service.delete(idEntregables);
		return "redirect:/listar";
	}
}
