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

import com.myproyect.demo.app.data.Canales;
import com.myproyect.demo.app.interfaceService.ICanalesService;

@Controller
@RequestMapping
public class ControladorCanales {
	
	@Autowired
	private ICanalesService service;
	
	@GetMapping("/listarCanales")
	public String listar(Model model) {		
		List<Canales>canales=service.Listar();
		model.addAttribute("canales", canales);
		return "index";
		
	}
	
	@GetMapping("/newCanales")
	public String agregar(Model model) {
		model.addAttribute("canales", new Canales());
		return "form";
	}
	
	@PostMapping("/saveCanales")
	public String save(@Validated Canales can, Model model) {
		service.save(can);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editarCanales/{idCanal}")
	public String editar(@PathVariable int idCanal, Model model) {
		Optional<Canales>canales=service.ListarId(idCanal);
		model.addAttribute("canales", canales);
		return "form";
	}
	
	@GetMapping("/eliminarCanales/{idCanal}")
	public String delete(Model model, @PathVariable int idCanal) {
		service.delete(idCanal);
		return "redirect:/listar";
	}
}
