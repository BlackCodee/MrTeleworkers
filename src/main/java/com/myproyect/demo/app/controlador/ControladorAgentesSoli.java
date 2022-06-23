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


import com.myproyect.demo.app.data.AgentesSoli;
import com.myproyect.demo.app.interfaceService.IAgentesSoliService;
import com.myproyect.demo.app.repository.IAgentesSoli;

@Controller
@RequestMapping

public class ControladorAgentesSoli {

	@Autowired
	private IAgentesSoliService service;
	
	@Autowired
	private IAgentesSoli iAgentesSoli;
	
	@GetMapping("/Puntaje")
	public String puntaje( Model model) {	
		String puntaje= iAgentesSoli.puntajeAgentes();
		model.addAttribute("Puntaje",puntaje);
		return "Asistencia/Agentes/puntaje";
		
	}
	
	
	
	@GetMapping("/listarAgentesSoli")
	public String listar(Model model) {		
		List<AgentesSoli>agentesSoli=service.Listar();
		model.addAttribute("agentesSoli", agentesSoli);
		return "Asistencia/Agentes/Agente";
		
	}
	
	@GetMapping("/newAgentesSoli")
	public String agregar(Model model) {
		model.addAttribute("agentesSoli", new AgentesSoli());
		return "Asistencia/Agentes/EditarSol";
	}
	
	@PostMapping("/saveAgentesSoli")
	public String save(@Validated AgentesSoli ags, Model model) {
		service.save(ags);
		return "redirect:listarAgentesSoli";
		
	}
	
	@GetMapping("/editarAgentesSoli/{idSoli}")
	public String editar(@PathVariable int idSoli, Model model) {
		Optional<AgentesSoli>agentesSoli=service.ListarId(idSoli);
		model.addAttribute("agentesSoli", agentesSoli);
		return "Asistencia/Agentes/EditarSol";
	}
	
	
	@GetMapping("/eliminarAgentesSoli/{id}")
	public String delete(Model model, @PathVariable int idSoli) {
		service.delete(idSoli);
		return "redirect:listarAgentesSoli";
	}
	
	
	@RequestMapping("/estado")
    public String estado(
    @RequestParam(name = "", defaultValue = "0") Integer id) {
        AgentesSoli aux = iAgentesSoli.findById(id).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iAgentesSoli.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iAgentesSoli.save(aux);
        }
         return "redirect:listarAgentesSoli";
    } 
	
	@RequestMapping("/puntajeAgente")
    public String puntajeAgente(
    @RequestParam(name = "idSoli", defaultValue = "0") Integer idSoli) {
        AgentesSoli aux = iAgentesSoli.findById(idSoli).orElse(null);
        if(aux.getPrioridad().equals("ALTA") && (aux.getEstado().equals("PENDIENTE"))){
            aux.setPuntaje(15);
            aux.setEstado("SOLUCIONADO");
            iAgentesSoli.save(aux);
            
        } else if(aux.getPrioridad().equals("MEDIA")  && (aux.getEstado().equals("PENDIENTE"))){
            aux.setPuntaje(10);
            aux.setEstado("SOLUCIONADO");
            iAgentesSoli.save(aux);
        }
        
        else if(aux.getPrioridad().equals("BAJA")  && (aux.getEstado().equals("PENDIENTE"))){
            aux.setPuntaje(5);
            aux.setEstado("SOLUCIONADO");
            iAgentesSoli.save(aux);
        }
        
         return "redirect:listarAgentesSoli";
    }
	
}
