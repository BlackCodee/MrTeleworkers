package com.myproyect.demo.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControladorIndex {


    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    
    @RequestMapping("/dashboard-Agentes")
    public String dashboardAgente(){
        return "dashboard-Agentes";
    }

    @RequestMapping("/dashboard-Admin")
    public String dashboardAdmin(){
        return "dashboard-Admin";
    }

    @RequestMapping("/dashboard-Empleado")
    public String dashboardEmpleado(){
        return "dashboard-Empleado";
    }

    @RequestMapping("/dashboard-Jefe")
    public String dashboardJefe(){
        return "dashboard-Jefe";
    }
    
    @RequestMapping("/OlvidoContraseña")
    public String olvidoContraseña(){
        return "OlvidoContraseña";
    }
}
