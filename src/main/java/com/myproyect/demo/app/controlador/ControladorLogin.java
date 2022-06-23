package com.myproyect.demo.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/*@Configuration*/

@Controller
@RequestMapping
public class ControladorLogin /*implements WebMvcConfigurer*/  {
	
    /*
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}
	@Autowired
	private IUsuario iusuario;
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	RolService rolService;
	
	@GetMapping("/Login")
	public String Login(Usuario usuario) {
		return "login";
	}
	
    @PostMapping("/loginSesion")
    public String loginSesion(Model model, Usuario usuario){
    Usuario verificar = iusuario.findByEmailAndContrasena(usuario.getEmail(), usuario.getContrasena());
	if(verificar != null) {
		if(verificar.getIdRol().getNomRol().equals("ADMINISTRADOR")) {
			return "dashboard-Admin";
		}else if(verificar.getIdRol().getNomRol().equals("EMPLEADO")) {
			return "dashboard-Empleado";
		}if(verificar.getIdRol().getNomRol().equals("JEFE DE PLANTA")) {
			return "dashboard-Jefe";
		}		
	}return "login";
    
    }
    
    @RequestMapping("/login")
    public String Login(Model model, Usuario usuario){
    	List<Usuario>usuarios=usuarioService.Listar();
    	model.addAttribute("usuario", usuario);
        return "login";
    }
	
    
    @RequestMapping(value="/Iniciarsesion")
	public String iniciarSesion(Model model, Usuario usuario) {
		List<Usuario> usuarios=this.usuarioService.Listar();
		String url="/login";
		System.out.println("@@"+usuario.getContrasena());
		for(Usuario usu:usuarios) {
			if(usu.getContrasena().equals(usuario.getContrasena())&& usu.getEmail().equals(usuario.getEmail())) {
		       Rol rol=rolService.ListarById(usu.getIdRol().getIdRol());
		       if(rol.getNomRol().equals("ADMINISTRADOR")) {
		    	  model.addAttribute("usuario",usuario);
		    	  url = "/dashboard-Admin";
		       }
		       if(rol.getNomRol().equals("EMPLEADO")) {
			    	  model.addAttribute("usuario",usuario);
			    	  url = "/dashboard-Empleado";
			       }
		       
		       if(rol.getNomRol().equals("JEFE DE PLANTA")) {
			    	  model.addAttribute("usuario",usuario);
			    	  url = "/dashboard-Jefe";
			       }
			}
		}
		return url;
	}*/
    

}
