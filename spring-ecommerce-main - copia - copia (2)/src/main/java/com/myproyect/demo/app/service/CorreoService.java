package com.myproyect.demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.security.IUsuarioService;


@Service
public class CorreoService {

	@Autowired
	private JavaMailSender mailsender;
	
	@Autowired
	private IUsuarioService usuario;
	
	public void sendEmail (String from, String subject, String content) { 
	
		
		List<Usuario>uM=usuario.Listar();
		for (Usuario u :uM) {
			SimpleMailMessage email=new SimpleMailMessage();
			
			email.setFrom(from);
			
			email.setTo(u.getEmail());
			
			email.setSubject(subject);
			
			email.setText(content);
			
			mailsender.send(email);
		}
		
	}
}
