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

import com.myproyect.demo.app.data.Proveedor;
import com.myproyect.demo.app.interfaceService.IProveedorService;
import com.myproyect.demo.app.repository.IProveedor;

@Controller
@RequestMapping
public class ControladorProveedor {
	
	@Autowired
	private IProveedorService service;
	
	@Autowired
	private IProveedor iProveedor;
	
	@GetMapping("/listarProveedor")
	public String listar(Model model) {		
		List<Proveedor>proveedor=service.Listar();
		model.addAttribute("proveedor", proveedor);
		return "/Inventarios/Administrador/proveedoresAdmin";
		
	}
	
	@GetMapping("/newProveedor")
	public String agregar(Model model) {
		model.addAttribute("proveedor", new Proveedor());
		return "/Inventarios/Administrador/nuevoProvAdmin";
	}
	
	@PostMapping("/saveProveedor")
	public String save(@Validated Proveedor prov, Model model) {
		service.save(prov);
		return "redirect:/listarProveedor";
		
	}
	
	@GetMapping("/editarProveedor/{idProveedor}")
	public String editar(@PathVariable int idProveedor, Model model) {
		Optional<Proveedor>proveedor=service.ListarId(idProveedor);
		model.addAttribute("proveedor", proveedor);
		return "/Inventarios/Administrador/nuevoProvAdmin";
	}
	
	@GetMapping("/eliminarProveedor/{idProveedor}")
	public String delete(Model model, @PathVariable int idProveedor) {
		service.delete(idProveedor);
		return "redirect:/listarProveedor";
	}
	

	@RequestMapping("/estadoProveedor")
    public String estadoProveedor(
    @RequestParam(name = "idProveedor", defaultValue = "0") Integer idProveedor) {
        Proveedor aux = iProveedor.findById(idProveedor).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iProveedor.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iProveedor.save(aux);
        }
         return "redirect:/listarProveedor";
    }
	
}