package com.myproyect.demo.app.repository;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.myproyect.demo.app.data.Pedidos;

@Repository
public interface IPedidos  extends JpaRepository<Pedidos, Integer>{
	@Query(value="SELECT * FROM PEDIDOS WHERE ID_PEDIDO=?",nativeQuery = true)
 	public Pedidos findId(int id);
}
