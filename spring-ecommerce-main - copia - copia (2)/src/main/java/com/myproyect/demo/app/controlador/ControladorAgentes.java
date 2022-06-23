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

import com.myproyect.demo.app.data.Agentes;
import com.myproyect.demo.app.interfaceService.IAgentesService;
import com.myproyect.demo.app.repository.IAgentes;


@Controller
@RequestMapping
public class ControladorAgentes {
	@Autowired
	private IAgentesService service;
	
	@Autowired
	private IAgentes iAgentes;
	
	@GetMapping("/listarAgentes")
	public String listar(Model model) {		
		List<Agentes>agentes=service.Listar();
		model.addAttribute("agentes", agentes);
		return "/Asistencia/Administrador/agentesActivos";
		
	}
	
	@GetMapping("/newAgentes")
	public String agregar(Model model) {
		model.addAttribute("agentes", new Agentes());
		return "/Asistencia/Administrador/nuevoAge";
	}
	
	@PostMapping("/saveAgentes")
	public String save(@Validated Agentes ag, Model model) {
		service.save(ag);
		return "redirect:/listarAgentes";
		
	}
	
	@GetMapping("/editarAgentes/{idAgente}")
	public String editar(@PathVariable int idAgente, Model model) {
		Optional<Agentes>agentes=service.ListarId(idAgente);
		model.addAttribute("agentes", agentes);
		return "/Asistencia/Administrador/nuevoAge";
	}
	
	@GetMapping("/eliminarAgentes/{idAgente}")
	public String delete(Model model, @PathVariable int idAgente) {
		service.delete(idAgente);
		return "redirect:/listarAgentes";
	}
	
	
	@RequestMapping("/estadoAgente")
    public String estadoAgente(
    @RequestParam(name = "idAgente", defaultValue = "0") Integer idAgente) {
        Agentes aux = iAgentes.findById(idAgente).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iAgentes.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iAgentes.save(aux);
        }
         return "redirect:/listarAgentes";
    }
	
	
}
