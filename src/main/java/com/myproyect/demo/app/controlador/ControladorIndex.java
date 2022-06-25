package com.myproyect.demo.app.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproyect.demo.app.repository.IInsumos;
import com.myproyect.demo.app.repository.IProveedor;
import com.myproyect.demo.app.repository.IUsuario;


@Controller
public class ControladorIndex {

	@Autowired
	public IUsuario iusuario;
	
	@Autowired
	public IInsumos iinsumo;
	
	@Autowired
	public IProveedor iproveedor;
	

    @RequestMapping({"/","/index"})
    public String index(Model model){
    	
        return "index";
    }
    
    @RequestMapping("/dashboard-Agentes")
    public String dashboardAgente(Model model){
    	model.addAttribute("usuarios", iusuario.usuariosActivos());
    	model.addAttribute("agentes", iusuario.agentesActivos());
    	model.addAttribute("insumos", iinsumo.insumosActivosDisponibles());
    	model.addAttribute("proveedores", iproveedor.proveedoresActivos());
        return "dashboard-Agentes";
    }

    @RequestMapping("/dashboard-Admin")
    public String dashboardAdmin(Model model){
    	model.addAttribute("usuarios", iusuario.usuariosActivos());
    	model.addAttribute("agentes", iusuario.agentesActivos());
    	model.addAttribute("insumos", iinsumo.insumosActivosDisponibles());
    	model.addAttribute("proveedores", iproveedor.proveedoresActivos());
    	return "dashboard-Admin";
    }

    @RequestMapping("/dashboard-Empleado")
    public String dashboardEmpleado(Model model){
    	model.addAttribute("usuarios", iusuario.usuariosActivos());
    	model.addAttribute("agentes", iusuario.agentesActivos());
    	model.addAttribute("insumos", iinsumo.insumosActivosDisponibles());
    	model.addAttribute("proveedores", iproveedor.proveedoresActivos());
        return "dashboard-Empleado";
    }

    @RequestMapping("/dashboard-Jefe")
    public String dashboardJefe(Model model){
    	model.addAttribute("usuarios", iusuario.usuariosActivos());
    	model.addAttribute("agentes", iusuario.agentesActivos());
    	model.addAttribute("insumos", iinsumo.insumosActivosDisponibles());
    	model.addAttribute("proveedores", iproveedor.proveedoresActivos());
        return "dashboard-Jefe";
    }
    
    @RequestMapping("/OlvidoContraseña")
    public String olvidoContraseña(){
        return "OlvidoContraseña";
    }
}
