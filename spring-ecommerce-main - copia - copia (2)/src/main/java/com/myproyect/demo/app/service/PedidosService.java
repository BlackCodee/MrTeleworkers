package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Pedidos;
import com.myproyect.demo.app.interfaceService.IPedidosService;
import com.myproyect.demo.app.repository.IPedidos;

@Service
public class PedidosService implements IPedidosService {

	@Autowired
	private IPedidos data;
	
	@Override
	public List<Pedidos> Listar() {
		
		return (List<Pedidos>)data.findAll();
	}

	@Override
	public Optional<Pedidos> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Pedidos pedi) {
		int res=0;
		Pedidos pedidos=data.save(pedi);
		if (!pedidos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
