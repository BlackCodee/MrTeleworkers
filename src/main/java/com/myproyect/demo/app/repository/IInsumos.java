package com.myproyect.demo.app.repository;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Insumos;

@Repository
public interface IInsumos  extends JpaRepository<Insumos, Integer>{
	@Query(value="SELECT * FROM INSUMOS WHERE ID_INSUMO=?",nativeQuery = true)
 	public Insumos findId(int id);
	
	@Query(value="SELECT COUNT(*) FROM `insumos` ins WHERE ins.estado = 'activo' AND ins.descripcion = 'Disponible'",nativeQuery = true)
 	public int insumosActivosDisponibles();
}
