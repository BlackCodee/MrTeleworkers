package com.myproyect.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Entregables;

@Repository
public interface IEntregables  extends JpaRepository<Entregables, Integer>{
	@Query(value="SELECT * FROM entregables WHERE id_actividad=?",nativeQuery = true)
 	public List<Entregables> findIdActividad(int id);
	
	@Query(value="SELECT * FROM entregables WHERE id_actividad=? AND id_usuario=?",nativeQuery = true)
 	public Entregables findEntregado(int idActividad, int idUsuario);
	
	public Entregables findById(int idEntregables);
}
