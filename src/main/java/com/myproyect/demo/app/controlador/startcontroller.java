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

import com.myproyect.demo.app.clases.DeveloperTutorial;
import com.myproyect.demo.app.clases.IDeveloper_TutorialService;
import com.myproyect.demo.app.data.Computador;
import com.myproyect.demo.app.interfaceService.IComputadorService;


@Controller
@RequestMapping
public class startcontroller {
	
	@Autowired
	private IComputadorService service;

	@Autowired
	private IDeveloper_TutorialService developer;
	
	 @GetMapping("/cargamasiva")
	    public String cargamasiva(Model model) {
		 	List<DeveloperTutorial> deve = developer.Listar();
			List<Computador>computador=service.Listar();
			model.addAttribute("developer", deve);
			model.addAttribute("computador", computador);
	        return "carga_masiva";
	    }
	    
	

}