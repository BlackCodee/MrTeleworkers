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

import com.myproyect.demo.app.data.Computador;
import com.myproyect.demo.app.interfaceService.IComputadorService;
import com.myproyect.demo.app.repository.IComputador;

@Controller
@RequestMapping
public class ControladorComputador {
	
	@Autowired
	private IComputadorService service;
	
	@Autowired
	private IComputador iComputador;
	
    @RequestMapping("/solicitudComputador")
    public String index(){
        return "/Inventarios/Empleado/compuEmpl";
    }
	
	@GetMapping("/listarComputador")
	public String listar(Model model) {		
		List<Computador>computador=service.Listar();
		model.addAttribute("computador", computador);
		return "Inventarios/Administrador/compuAdmin";
		
	}
	
	@GetMapping("/newComputador")
	public String agregar(Model model) {
		model.addAttribute("computador", new Computador());
		return "Inventarios/Administrador/nuevoCompAdmin";
	}
	
	@PostMapping("/saveComputador")
	public String save(@Validated Computador com, Model model) {
		service.save(com);
		return "redirect:listarComputador";
		
	}
	
	@GetMapping("/editarComputador/{idComputador}")
	public String editar(@PathVariable int idComputador, Model model) {
		Computador computador = iComputador.findId(idComputador);
		model.addAttribute("computador", computador);
		return "Inventarios/Administrador/editarCompAdmin";
	}
	
	@RequestMapping("/estadoComputador")
    public String estadoComputador(
    @RequestParam(name = "idComputador", defaultValue = "0") Integer idComputador) {
        Computador aux = iComputador.findById(idComputador).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iComputador.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iComputador.save(aux);
        }
         return "redirect:listarComputador";
    }
}