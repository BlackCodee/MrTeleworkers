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

import com.myproyect.demo.app.data.Insumos;
import com.myproyect.demo.app.interfaceService.IInsumosService;
import com.myproyect.demo.app.repository.IInsumos;

@Controller
@RequestMapping
public class ControladorInsumos {
	
	@Autowired
	private IInsumosService service;
	
	@Autowired
	private IInsumos iInsumos;
	
	@GetMapping("/listarInsumos")
	public String listar(Model model) {		
		List<Insumos>insumos=service.Listar();
		model.addAttribute("insumos", insumos);
		return "Inventarios/Administrador/insumosAdmin";
		
	}
	@GetMapping("/listarInsumosEmpleado")
	public String listarE(Model model) {		
		List<Insumos>insumos=service.Listar();
		model.addAttribute("insumos", insumos);
		return "Inventarios/Empleado/insumosEmpl";
		
	}
	
	@GetMapping("/newInsumos")
	public String agregar(Model model) {
		model.addAttribute("insumos", new Insumos());
		return "Inventarios/Administrador/nuevoInsAdmin";
	}
	
	@PostMapping("/saveInsumos")
	public String save(@Validated Insumos insu, Model model) {
		service.save(insu);
		return "redirect:listarInsumos";
		
	}

	@GetMapping("/editarInsumos/{idInsumo}")
	public String editar(@PathVariable int idInsumo, Model model) {
		Insumos insumos = iInsumos.findByIdInsumo(idInsumo);
		model.addAttribute("insumos", insumos);
		return "Inventarios/Administrador/editarInsAdmin";
	}
	
	@GetMapping("/eliminarInsumos/{idInsumo}")
	public String delete(Model model, @PathVariable int idInsumo) {
		service.delete(idInsumo);
		return "redirect:listarInsumos";
	}
	
	@RequestMapping("/estadoInsumo")
    public String estadoInsumo(
    @RequestParam(name = "idInsumo", defaultValue = "0") Integer idInsumo) {
        Insumos aux = iInsumos.findById(idInsumo).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iInsumos.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iInsumos.save(aux);
        }
         return "redirect:listarInsumos";
    }

}
