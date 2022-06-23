package com.myproyect.demo.app.controlador;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.myproyect.demo.app.data.Usuario;
import com.myproyect.demo.app.service.ComputadorService;
import com.myproyect.demo.app.service.InsumosService;
import com.myproyect.demo.app.service.ProveedorService;
import com.myproyect.demo.app.service.UploadFileService;
import com.myproyect.demo.app.security.UsuarioService;

@Controller
public class CargaMasivaController {
	@Autowired
	UploadFileService uploadFileService;
	
	@Autowired
	UsuarioService usuarioService;	
	
	@Autowired
	ProveedorService proveedorService;	
	
	@Autowired
	InsumosService insumosService;	
	
	@Autowired
	ComputadorService computadorService;
	
	@RequestMapping("/uploadFileUsuario")
	public String saveFileExcelUsuario(MultipartFile file, Model model)throws IOException{
		System.out.println("@@#@#@#"+file.getName());
		this.uploadFileService.guardarFile(file);
		List<Usuario> listUsuario = this.usuarioService.Listar();
		model.addAttribute("listUsuario", listUsuario);
		return "redirect:listarUsuarios";
	}
	
	@RequestMapping("/uploadFileProveedor")
	public String saveFileExcelProveedor(MultipartFile file, Model model)throws IOException{
		this.uploadFileService.guardarFileProveedor(file);
		return "redirect:listarProveedor";
	}

	@RequestMapping("/uploadFileInsumos")
	public String saveFileExcelInsumos(MultipartFile file, Model model)throws IOException{
		this.uploadFileService.guardarFileInsumos(file);
		return "redirect:listarInsumos";
	}

	@RequestMapping("/uploadFileComputador")
	public String saveFileExcelComputador(MultipartFile file, Model model)throws IOException{
		this.uploadFileService.guardarFileComputador(file);
		return "redirect:listarComputador";
	}
}
