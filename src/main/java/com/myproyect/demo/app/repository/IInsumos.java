package com.myproyect.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Insumos;

@Repository
public interface IInsumos  extends JpaRepository<Insumos, Integer>{
	
	@Query(value="SELECT * FROM insumos WHERE id_insumo=?",nativeQuery = true)
	public List<Insumos> findInsumo(int idInsumo);
	
	@Query(value="SELECT COUNT(*) FROM `insumos` ins WHERE ins.estado = 'activo' AND ins.descripcion = 'Disponible'",nativeQuery = true)
 	public int insumosActivosDisponibles();
	
	public Insumos findByIdInsumo(int idInsumo);
}
