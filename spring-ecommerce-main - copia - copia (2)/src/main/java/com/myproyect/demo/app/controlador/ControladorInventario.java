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

import com.myproyect.demo.app.data.Inventarios;
import com.myproyect.demo.app.interfaceService.IInventariosService;

@Controller
@RequestMapping
public class ControladorInventario {
	
	@Autowired
	private IInventariosService service;
	
	@RequestMapping("/listarStock")
    public String informes(){
        return "/Inventarios/Administrador/stockAdmin";
    }
	
	
    @RequestMapping("/Inventarios-Admin")
    public String InventariosAdmin(){
        return "/Inventarios/Administrador/inventariosAdmin";
    }
    @RequestMapping("/Inventarios-Empleado")
    public String InventariosEmple(){
        return "/Inventarios/Empleado/inventariosEmpl";
    }
	
	@GetMapping("/listarInventarios")
	public String listar(Model model) {		
		List<Inventarios>inventarios=service.Listar();
		model.addAttribute("inventarios", inventarios);
		return "index";
		
	}
	
	@GetMapping("/newInventarios")
	public String agregar(Model model) {
		model.addAttribute("inventarios", new Inventarios());
		return "form";
	}
	
	@PostMapping("/saveInventarios")
	public String save(@Validated Inventarios inve, Model model) {
		service.save(inve);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editarInventarios/{idInventario}")
	public String editar(@PathVariable int idInventario, Model model) {
		Optional<Inventarios>inventarios=service.ListarId(idInventario);
		model.addAttribute("inventarios", inventarios);
		return "form";
	}
	
	@GetMapping("/eliminarInventarios/{idInventario}")
	public String delete(Model model, @PathVariable int idInventario) {
		service.delete(idInventario);
		return "redirect:/listar";
	}

}
