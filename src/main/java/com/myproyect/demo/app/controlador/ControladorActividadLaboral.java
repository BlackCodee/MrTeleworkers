package com.myproyect.demo.app.controlador;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.apache.poi.ss.util.CellRangeAddressList;
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
import com.myproyect.demo.app.data.Entregables;
import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.interfaceService.IActividadLaboralService;
import com.myproyect.demo.app.repository.IActividadLaboral;
import com.myproyect.demo.app.repository.IEntregables;
import com.myproyect.demo.app.repository.IUsuario;

@Controller
@RequestMapping
public class ControladorActividadLaboral {

	@Autowired
	private IActividadLaboralService service;
	
	@Autowired
	private IActividadLaboral iActividad;
	
	@Autowired
	private IEntregables iEntregable;
	
	@Autowired
	private IUsuario iUsuario;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/listarActividadLaboral")
	public String listar(Model model) {		
		List<ActividadLaboral>actividadLaboral=service.Listar();
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "Seguimiento/JefeArea/Actividades-Jefe";
		
	}
	@GetMapping("/listarActividadLaboralEmpleado")
	public String listarE(Model model) {
		int idUsu = (int) session.getAttribute("idusuario");
		Usuario usu = iUsuario.findId(idUsu); 
		List<ActividadLaboral> actividadesArea = iActividad.findActividadesArea(usu.getAreaidArea().getIdArea());
		
		model.addAttribute("usuario", usu);
		model.addAttribute("actividadLaboral", actividadesArea);
		
		return "Seguimiento/Empleado/Actvidades_Empleado";
		
	}
	@GetMapping("/EntregarActividadLaboral")
	public String listarEntregable(Model model) {		
		List<ActividadLaboral>actividadLaboral=service.Listar();
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "Seguimiento/Empleado/Entrega_Actividad";
		
	}
	
	@GetMapping("/newActividadLaboral")
	public String agregar(Model model) {
		model.addAttribute("actividadLaboral", new ActividadLaboral());
		return "Seguimiento/JefeArea/Creacion-Eventos";
	}
	
	@PostMapping("/saveActividadLaboral")
	public String save(@Validated ActividadLaboral al, Model model) {
		Date hoy = new Date();
		al.setFechaModificacion(hoy);
		al.setEstado("activo");
		service.save(al);
		return "redirect:listarActividadLaboral";
		
	}
	
	@GetMapping("/editarActividadLaboral/{idActividad}")
	public String editar(@PathVariable int idActividad, Model model) {
		ActividadLaboral actividadLaboral = iActividad.findByIdActividad(idActividad);
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "Seguimiento/JefeArea/editar_actividades";
	}
	
	@GetMapping("/verActividadLaboral/{idActividad}")
	public String verActividad(@PathVariable int idActividad, Model model) {
		ActividadLaboral actividad = new ActividadLaboral();
		Optional<ActividadLaboral>actividadLaboral=service.ListarId(idActividad);
		actividad = actividadLaboral.get();
		model.addAttribute("actividadLaboral", actividadLaboral);
		return "Seguimiento/Empleado/Entrega_Actividad";
	}
	
	
	@RequestMapping("/estadoActividad")
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
         return "redirect:listarActividadLaboral";
    }
	
	
	
}
