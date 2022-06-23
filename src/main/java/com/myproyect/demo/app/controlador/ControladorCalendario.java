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

import com.myproyect.demo.app.data.Calendario;
import com.myproyect.demo.app.interfaceService.ICalendarioService;

@Controller
@RequestMapping
public class ControladorCalendario {
	
	@Autowired
	private ICalendarioService service;
	
	@GetMapping("/listarCalendario")
	public String listar(Model model) {		
		List<Calendario>calendario=service.Listar();
		model.addAttribute("calendario", calendario);
		return "Seguimiento/Empleado/Eventos_Usuario";
		
	}
	
	@GetMapping("/Calendario")
	public String Calendario(Model model) {		
		List<Calendario>calendario=service.Listar();
		model.addAttribute("calendario", calendario);
		return "Seguimiento/Empleado/calendario";
		
	}
	
	@GetMapping("/newCalendario")
	public String agregar(Model model) {
		model.addAttribute("calendario", new Calendario());
		return "form";
	}
	
	@PostMapping("/saveCalendario")
	public String save(@Validated Calendario cal, Model model) {
		service.save(cal);
		return "redirect:listar";
		
	}
	
	@GetMapping("/editarCalendario/{idCalendario}")
	public String editar(@PathVariable int idCalendario, Model model) {
		Optional<Calendario>calendario=service.ListarId(idCalendario);
		model.addAttribute("calendario", calendario);
		return "form";
	}
	
	@GetMapping("/eliminarCalendario/{idCalendario}")
	public String delete(Model model, @PathVariable int idCalendario) {
		service.delete(idCalendario);
		return "redirect:listar";
	}
	
}
