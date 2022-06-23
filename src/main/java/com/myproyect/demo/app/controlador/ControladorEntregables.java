package com.myproyect.demo.app.controlador;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

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
import com.myproyect.demo.app.data.Capacitaciones;
import com.myproyect.demo.app.data.Entregables;
import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.interfaceService.IEntregablesService;
import com.myproyect.demo.app.repository.IActividadLaboral;
import com.myproyect.demo.app.repository.IEntregables;
import com.myproyect.demo.app.repository.IUsuario;

@Controller
@RequestMapping
public class ControladorEntregables {
	@Autowired
	private IActividadLaboral iActividad;
	
	@Autowired
	private IEntregablesService service;
	
	@Autowired
	private IEntregables iEntregable;
	
	@Autowired
	private IUsuario iUsuario;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/listarEntregables/{idActividad}")
	public String listar(@PathVariable int idActividad, Model model) {		
		List<Entregables>entregables=iEntregable.findIdActividad(idActividad);
		model.addAttribute("entregables", entregables);
		return "Seguimiento/JefeArea/Revision_entregables";
	}
	
	@GetMapping("/verEntregables/{idActividad}/{idEntregable}")
	public String verEntregable(@PathVariable int idActividad, @PathVariable int idEntregable, Model model) {		
		ActividadLaboral actividad = iActividad.findByIdActividad(idActividad);
		Entregables entregables=iEntregable.findById(idEntregable);		
		model.addAttribute("actividad", actividad);
		model.addAttribute("entregable", entregables);
		return "Seguimiento/JefeArea/verEntregable";
	}
	
	@GetMapping("/EntregarActividad/{idActividad}")
	public String verEntregableEmpleado(@PathVariable int idActividad, HttpSession session, Model model) {		
		ActividadLaboral actividad = iActividad.findByIdActividad(idActividad);	
		model.addAttribute("actividad", actividad);
		model.addAttribute("idActividad", idActividad);
		model.addAttribute("EstadoEntrega", "Por Entregar");
		
		session.getAttribute("idusuario");
		int idUsu = (int) session.getAttribute("idusuario");
		
		Entregables entre = iEntregable.findEntregado(idActividad, idUsu);
		if (entre != null) {
			model.addAttribute("entregable", entre);
		}else{
			model.addAttribute("entregable", new Entregables());	
		}
		
		
		return "Seguimiento/Empleado/Entrega_Actividad";
	}
	
	@PostMapping("/saveEntregables/{idActividad}")
	public String save(@Validated Entregables ent, @PathVariable int idActividad , Model model) {
		
		ActividadLaboral actividad = iActividad.findByIdActividad(idActividad);	
		int idUsu = (int) session.getAttribute("idusuario");
		Usuario usu = iUsuario.findId(idUsu);
		
		Date fecha = new Date();
		Date hora = new Date();
		
		ent.setFechaEntrega(fecha);
		ent.setHoraEntrega(hora);
		
		ent.setIdUsuario(usu);
		ent.setIdActividad(actividad);
		
		
		model.addAttribute("entregable", ent);
			if (ent.getFechaEntrega().after(actividad.getFechaEntrega()) && ent.getHoraEntrega().after(actividad.getHoraEntrega())) {
				ent.setEstado("Entrega Tardia");
				ent.setRevisado("No");
			}
			if (fecha.before(actividad.getFechaEntrega()) && hora.before(actividad.getHoraEntrega())) {
				ent.setEstado("Entregada A Tiempo");
				ent.setRevisado("No");
			}
		
		
		
		service.save(ent);
		return "redirect:listarActividadLaboralEmpleado";
		
	}
	
	@RequestMapping("/marcarRevisado/{idEntregable}")
	public String revisar(@PathVariable int idEntregable) {
		Entregables aux = iEntregable.findById(idEntregable);
		if(aux.getRevisado().equals("No")){
            aux.setRevisado("Si");
            iEntregable.save(aux);
        } else if(aux.getRevisado().equals("Si")){
        	aux.setRevisado("No");
            iEntregable.save(aux);
        }
		return "redirect:listarActividadLaboral";
	}

	@GetMapping("/newEntregables")
	public String agregar(Model model) {
		model.addAttribute("entregables", new Entregables());
		return "form";
	}
	

	
	
	@GetMapping("/eliminarEntregables/{idEntregables}")
	public String delete(Model model, @PathVariable int idEntregables) {
		service.delete(idEntregables);
		return "redirect:listar";
	}
}
