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

import com.myproyect.demo.app.data.Pedidos;
import com.myproyect.demo.app.interfaceService.IPedidosService;
import com.myproyect.demo.app.repository.IPedidos;

@Controller
@RequestMapping
public class ControladorPedidos {
	
	@Autowired
	private IPedidosService service;
	
	@Autowired
	private IPedidos iPedido;
	
	@GetMapping("/listarPedidos")
	public String listar(Model model) {		
		List<Pedidos>pedidos=service.Listar();
		model.addAttribute("pedidos", pedidos);
		return "/Inventarios/Administrador/pedidoInsAdmin";
		
	}
	
	@GetMapping("/newPedidos")
	public String agregar(Model model) {
		model.addAttribute("pedidos", new Pedidos());
		return "/Inventarios/Administrador/insumosAdmin2";
	}
	
	@PostMapping("/savePedidos")
	public String save(@Validated Pedidos pedi, Model model) {
		service.save(pedi);
		return "redirect:/listarPedidos";
		
	}
	
	@GetMapping("/editarPedidos/{idPedido}")
	public String editar(@PathVariable int idPedido, Model model) {
		Optional<Pedidos>pedidos=service.ListarId(idPedido);
		model.addAttribute("pedidos", pedidos);
		return "form";
	}
	
	@RequestMapping("/estadoPedido")
    public String estadoPedido(
    @RequestParam(name = "idPedido", defaultValue = "0") Integer idPedido) {
        Pedidos aux = iPedido.findById(idPedido).orElse(null);
        if(aux.getEstado().equals("activo")){
            aux.setEstado("inactivo");
            iPedido.save(aux);
        } else if(aux.getEstado().equals("inactivo")){
            aux.setEstado("activo");
            iPedido.save(aux);
        }
         return "redirect:/listarPedidos";
    }


}