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

import com.myproyect.demo.app.data.UsuarioInfo;
import com.myproyect.demo.app.interfaceService.IUsuarioInfoService;



@Controller
@RequestMapping

public class ControladorUsuarioInfo {
	
	@Autowired
	private IUsuarioInfoService service;
	
	
	
	@GetMapping("/listarUsuarioInfo")
	public String listar(Model model) {		
		List<UsuarioInfo>usuarioInfo=service.Listar();
		model.addAttribute("usuarioInfo", usuarioInfo);
		return "Asistencia/Agentes/info";
		
	}
	
	@GetMapping("/newUsuarioInfo")
	public String agregar(Model model) {
		model.addAttribute("usuarioInfo", new UsuarioInfo());
		return "Asistencia/Agentes/SolicitudesAsignadas";
	}
	
	@PostMapping("/saveUsuarioInfo")
	public String save(@Validated UsuarioInfo ui, Model model) {
		service.save(ui);
		return "redirect:listarUsuarioInfo";
		
	}
	
	@GetMapping("/editarUsuarioInfo/{idusu}")
	public String editar(@PathVariable int idusu, Model model) {
		Optional<UsuarioInfo>usuarioInfo=service.ListarId(idusu);
		model.addAttribute("usuarioInfo", usuarioInfo);
		return "Asistencia/Agentes/SolicitudesAsignadas";
	}
	
	
	@GetMapping("/eliminarUsuarioInfo/{idusu}")
	public String delete(Model model, @PathVariable int idusu) {
		service.delete(idusu);
		return "redirect:listarUsuarioInfo";
	}
	
	

}
