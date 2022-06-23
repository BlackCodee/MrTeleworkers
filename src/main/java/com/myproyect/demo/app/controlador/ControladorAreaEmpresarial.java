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

import com.myproyect.demo.app.data.AreaEmpresarial;
import com.myproyect.demo.app.interfaceService.IAreaEmpresarialService;

@Controller
@RequestMapping
public class ControladorAreaEmpresarial {
	@Autowired
	private IAreaEmpresarialService service;
	
	@GetMapping("/listarAreaEmpresarial")
	public String listar(Model model) {		
		List<AreaEmpresarial>areaEmpresarial=service.Listar();
		model.addAttribute("areaEmpresarial", areaEmpresarial);
		return "index";
		
	}
	
	@GetMapping("/newAreaEmpresarial")
	public String agregar(Model model) {
		model.addAttribute("agentes", new AreaEmpresarial());
		return "form";
	}
	
	@PostMapping("/saveAreaEmpresarial")
	public String save(@Validated AreaEmpresarial ae, Model model) {
		service.save(ae);
		return "redirect:listar";
		
	}
	
	@GetMapping("/editarAreaEmpresarial/{idArea}")
	public String editar(@PathVariable int idArea, Model model) {
		Optional<AreaEmpresarial>areaEmpresarial=service.ListarId(idArea);
		model.addAttribute("areaEmpresarial", areaEmpresarial);
		return "form";
	}
	
	@GetMapping("/eliminarAreaEmpresarial/{idArea}")
	public String delete(Model model, @PathVariable int idArea) {
		service.delete(idArea);
		return "redirect:listar";
	}
}
