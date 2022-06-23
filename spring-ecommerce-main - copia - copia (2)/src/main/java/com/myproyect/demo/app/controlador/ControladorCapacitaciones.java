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
import org.springframework.web.bind.annotation.RequestParam;

import com.myproyect.demo.app.data.Capacitaciones;
import com.myproyect.demo.app.interfaceService.ICapacitacionesService;
import com.myproyect.demo.app.repository.ICapacitaciones;

@Controller
@RequestMapping
public class ControladorCapacitaciones {
	
	@Autowired
	private ICapacitacionesService service;
	
	@Autowired
	private ICapacitaciones iCapacitacion;
	
	@GetMapping("/listarCapacitaciones")
	public String listar(Model model) {		
		List<Capacitaciones>capacitaciones=service.Listar();
		model.addAttribute("capacitaciones", capacitaciones);
		return "/Seguimiento/Administrador/Capacitacion-Admin";
		
	}	
	@GetMapping("/listarCapacitacionesEmpleado")
	public String listarE(Model model) {		
		List<Capacitaciones>capacitaciones=service.Listar();
		model.addAttribute("capacitaciones", capacitaciones);
		return "/Seguimiento/Empleado/Capacitacion_Empleado";
		
	}
	@GetMapping("/listarCapacitacionesJefe")
	public String listarJ(Model model) {		
		List<Capacitaciones>capacitaciones=service.Listar();
		model.addAttribute("capacitaciones", capacitaciones);
		return "/Seguimiento/JefeArea/Capacitacion_Jefe";
		
	}
	
	@GetMapping("/newCapacitaciones")
	public String agregar(Model model) {
		model.addAttribute("capacitaciones", new Capacitaciones());
		return "/Seguimiento/Administrador/Crear_Capacitacion";
	}
	
	@PostMapping("/saveCapacitaciones")
	public String save(@Validated Capacitaciones capa, Model model) {
		service.save(capa);
		return "redirect:/listarCapacitaciones";
		
	}
	
	@GetMapping("/editarCapacitaciones/{idCapacitacion}")
	public String editar(@PathVariable int idCapacitacion, Model model) {
		Optional<Capacitaciones>capacitaciones=service.ListarId(idCapacitacion);
		model.addAttribute("capacitaciones", capacitaciones);
		return "/Seguimiento/Administrador/editar_capacitacion";
	}
	
	
	@RequestMapping("/estadoCapacitacion")
    public String estadoActividad(
    @RequestParam(name = "idCapacitacion", defaultValue = "0") Integer idCapacitacion) {
		Capacitaciones aux = iCapacitacion.findById(idCapacitacion).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iCapacitacion.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iCapacitacion.save(aux);
        }
         return "redirect:/listarCapacitaciones";
    }
	
}
