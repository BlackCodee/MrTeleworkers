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


import com.myproyect.demo.app.data.Solicitudes;
import com.myproyect.demo.app.interfaceService.ISolicitudesService;
import com.myproyect.demo.app.repository.ISolicitudes;

@Controller
@RequestMapping
public class ControladorSolicitudes {
	
	
	
	@Autowired
	private ISolicitudes iSolicitud;
	
	@RequestMapping("/Informes-Admin")
    public String informes(){
        return "/Asistencia/Administrador/InformesAdminT";
    }
	
	

	
	@RequestMapping("/Empleado-AsistenciaT")
    public String empleado(){
        return "/Asistencia/Empleado/EmpleadoAsistenciaT";
    }
	
	@Autowired
	private ISolicitudesService service;
	
    @RequestMapping("/Asistencia-Admin")
    public String AsistenciaAdmin(){
        return "/Asistencia/Administrador/adminAsistenciaT";
    }
	
	
	@GetMapping("/listarSolicitudes")
	public String listar(Model model) {		
		List<Solicitudes>solicitudes=service.Listar();
		model.addAttribute("solicitudes", solicitudes);
		return "/Asistencia/Administrador/solicitudesAdmin";
		
	}
	
	@GetMapping("/newSolicitudes")
	public String agregar(Model model) {
		model.addAttribute("solicitudes", new Solicitudes());
		return "/Asistencia/Administrador/nuevaSol";
	}
	
	@PostMapping("/saveSolicitudes")
	public String save(@Validated Solicitudes sol, Model model) {
		service.save(sol);
		return "redirect:/listarSolicitudes";
		
	}
	
	@GetMapping("/editarSolicitudes/{idSolicitud}")
	public String editar(@PathVariable int idSolicitud, Model model) {
		Optional<Solicitudes>solicitudes=service.ListarId(idSolicitud);
		model.addAttribute("solicitudes", solicitudes);
		return "/Asistencia/Administrador/nuevaSol";
	}
	
	@GetMapping("/eliminarSolicitudes/{idSolicitud}")
	public String delete(Model model, @PathVariable int idSolicitud) {
		service.delete(idSolicitud);
		return "redirect:/listarSolicitudes";
	}
	
	@RequestMapping("/estadoSolicitud")
    public String estadoSolicitud(
    @RequestParam(name = "idSolicitud", defaultValue = "0") Integer idSolicitud) {
		Solicitudes aux = iSolicitud.findById(idSolicitud).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iSolicitud.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iSolicitud.save(aux);
        }
         return "redirect:/listarSolicitudes";
    }
	
}
