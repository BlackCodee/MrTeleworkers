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

import com.myproyect.demo.app.data.Inscripcion;
import com.myproyect.demo.app.interfaceService.IInscripcionService;

@Controller
@RequestMapping
public class ControladorInscripcion {
	
	@Autowired
	private IInscripcionService service;
	
	@GetMapping("/formInscripcionEmpleado")
	public String listarE(Model model) {		
		List<Inscripcion>inscripcion=service.Listar();
		model.addAttribute("inscripcion", inscripcion);
		return "Seguimiento/Empleado/Inscripcion_Empleado";
		
	}	
	@GetMapping("/formInscripcionJefe")
	public String listarJ(Model model) {		
		List<Inscripcion>inscripcion=service.Listar();
		model.addAttribute("inscripcion", inscripcion);
		return "Seguimiento/JefeArea/Inscripcion_Jefe";
		
	}
	
	@GetMapping("/newInscripcion")
	public String agregar(Model model) {
		model.addAttribute("inscripcion", new Inscripcion());
		return "Seguimiento/Empleado/Inscripcion_Empleado";
	}
	
	@PostMapping("/saveInscripcion")
	public String save(@Validated Inscripcion ins, Model model) {
		service.save(ins);
		return "redirect:listarCapacitacionesEmpleado";
		
	}
	
	@GetMapping("/editarInscripcion/{idInscripcion}")
	public String editar(@PathVariable int idInscripcion, Model model) {
		Optional<Inscripcion>inscripcion=service.ListarId(idInscripcion);
		model.addAttribute("inscripcion", inscripcion);
		return "form";
	}
	
	@GetMapping("/eliminarInscripcion/{idInscripcion}")
	public String delete(Model model, @PathVariable int idInscripcion) {
		service.delete(idInscripcion);
		return "redirect:listarInscripcion";
	}

}
