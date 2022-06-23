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
import com.myproyect.demo.app.data.Prestamos;
import com.myproyect.demo.app.interfaceService.IPrestamosService;
import com.myproyect.demo.app.repository.IComputador;
import com.myproyect.demo.app.repository.IPrestamos;


@Controller
@RequestMapping
public class ControladorPrestamos {
	
	
	@Autowired
	private IPrestamosService service;
	
	@Autowired
	private IPrestamos iPrestamo;
	
	@Autowired
	private IComputador iComputador;
	

	@GetMapping("/listarPrestamosEmpl")
	public String listarE(Model model) {		
		List<Prestamos>prestamos=service.Listar();
		model.addAttribute("prestamos", prestamos);
		return "Inventarios/Empleado/ListarPrestamosEmpl";
		
	}
	
	@GetMapping("/listarPrestamos")
	public String listar(Model model) {		
		List<Prestamos>prestamos=service.Listar();
		model.addAttribute("prestamos", prestamos);
		return "Inventarios/Administrador/compuAdmin2";
		
	}
	
	@GetMapping("/newPrestamos")
	public String agregar(Model model) {
		model.addAttribute("prestamos", new Prestamos());
		List<Computador>lstComputador = (List<Computador>)iComputador.findAll();
		model.addAttribute("lstPrestamos", lstComputador);
		return "Inventarios/Empleado/compEmp2";
	}
	
	@PostMapping("/savePrestamos")
	public String save(@Validated Prestamos pres, Model model) {
		service.save(pres);
		return "redirect:listarPrestamosEmpl";
		
	}
	
	
	
	@GetMapping("/eliminarPrestamos/{idPrestamo}")
	public String delete(Model model, @PathVariable int idPrestamo) {
		service.delete(idPrestamo);
		return "redirect:listarPrestamos";
	}
	
	@RequestMapping("/estadoPrestamo")
    public String estadoPrestamo(
    @RequestParam(name = "idPrestamo", defaultValue = "0") Integer idPrestamo) {
		Prestamos aux = iPrestamo.findById(idPrestamo).orElse(null);
        if(aux.getEstado().equals("aceptado")){
            aux.setEstado("rechazado");
            iPrestamo.save(aux);
        } else if(aux.getEstado().equals("rechazado")){
            aux.setEstado("aceptado");
            iPrestamo.save(aux);
        }
         return "redirect:listarPrestamos";
    }
	
}
