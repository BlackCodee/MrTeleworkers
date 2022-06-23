package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.Pedidos;

public interface IPedidosService{
	public List<Pedidos>Listar();
	public Optional<Pedidos>ListarId(int id);
	public int save(Pedidos pedi);
	public void delete(int id);
}
