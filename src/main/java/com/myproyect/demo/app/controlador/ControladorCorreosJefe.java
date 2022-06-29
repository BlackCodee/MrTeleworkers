package com.myproyect.demo.app.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproyect.demo.app.service.CorreoService;

@Controller
public class ControladorCorreosJefe {
	
	@Autowired
	private CorreoService correo;
	
	@RequestMapping("/listarmasivosJefe")
    public String correos(){
        return "form3";
    }
	
	@GetMapping ("/masivosJefe")
	public String sendEmail (@RequestParam("asunto")String subject,@RequestParam("contenido")String content) {
		
		correo.sendEmail("csanchex94@gmail.com", subject, content);
		return "form3";
	}
	
	
	
	

}
