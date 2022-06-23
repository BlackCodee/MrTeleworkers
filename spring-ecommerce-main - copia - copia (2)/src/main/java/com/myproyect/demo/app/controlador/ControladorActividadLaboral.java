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

import com.myproyect.demo.app.data.ActividadLaboral;
import com.myproyect.demo.app.interfaceService.IActividadLaboralService;
import com.myproyect.demo.app.repository.IActividadLaboral;

@Controller
@RequestMapping
public class ControladorActividadLaboral {

	@Autowired
	private IActividadLaboralService service;
	
	@Autowired
	private IActividadLaboral iActividad;
	
	@GetMapping("/listarActividadLaboral")
	public String listar(Model model) {		
		List<ActividadLaboral>actividadLaboral=service.Listar();
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "/Seguimiento/JefeArea/Actividades-Jefe";
		
	}
	@GetMapping("/listarActividadLaboralEmpleado")
	public String listarE(Model model) {		
		List<ActividadLaboral>actividadLaboral=service.Listar();
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "/Seguimiento/Empleado/Actvidades_Empleado";
		
	}
	@GetMapping("/EntregarActividadLaboral")
	public String listarEntregable(Model model) {		
		List<ActividadLaboral>actividadLaboral=service.Listar();
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "/Seguimiento/Empleado/Entrega_Actividad";
		
	}
	
	@GetMapping("/newActividadLaboral")
	public String agregar(Model model) {
		model.addAttribute("actividadLaboral", new ActividadLaboral());
		return "/Seguimiento/JefeArea/Creacion-Eventos";
	}
	
	@PostMapping("/saveActividadLaboral")
	public String save(@Validated ActividadLaboral al, Model model) {
		service.save(al);
		return "redirect:/listarActividadLaboral";
		
	}
	
	@GetMapping("/editarActividadLaboral/{idActividad}")
	public String editar(@PathVariable int idActividad, Model model) {
		Optional<ActividadLaboral>actividadLaboral=service.ListarId(idActividad);
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "/Seguimiento/JefeArea/editar_actividades";
	}
	
	
	
	@RequestMapping("/estadoUsuario")
    public String estadoActividad(
    @RequestParam(name = "idActividad", defaultValue = "0") Integer idActividad) {
		ActividadLaboral aux = iActividad.findById(idActividad).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iActividad.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iActividad.save(aux);
        }
         return "redirect:/listarActividadLaboral";
    }
	
	
	
}
