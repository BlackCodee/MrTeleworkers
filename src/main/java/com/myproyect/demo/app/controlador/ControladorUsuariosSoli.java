package com.myproyect.demo.app.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproyect.demo.app.data.UsuariosSoli;
import com.myproyect.demo.app.interfaceService.IUsuariosSoliService;

@Controller
@RequestMapping
public class ControladorUsuariosSoli {
	
	@Autowired
	private IUsuariosSoliService service;
	
	@GetMapping("/listarUsuariosSoli")
	public String listar(Model model) {		
		List<UsuariosSoli>usuariosSoli=service.Listar();
		model.addAttribute("usuariosSoli", usuariosSoli);
		return "Asistencia/Empleado/SolicitudesEmpleado";
		
	}
	
	@GetMapping("/newSolicitud")
	public String agregar(Model model) {
		model.addAttribute("usuariosSoli", new UsuariosSoli());
		return "Asistencia/Empleado/EmpleadoAsistenciaT";
	}
	
	@PostMapping("/saveSolicitud")
	public String save(@Validated UsuariosSoli soli, Model model) {
		service.save(soli);
		return "redirect:listarUsuariosSoli";
		
	}

}
