package com.myproyect.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.ActividadLaboral;

@Repository
public interface IActividadLaboral extends JpaRepository<ActividadLaboral, Integer>{
	
	@Query(value="SELECT * FROM actividad_laboral WHERE id_area=?",nativeQuery = true)
 	public List<ActividadLaboral> findActividadesArea(int idArea);
	
	public ActividadLaboral findByIdActividad(int idActividad);
}
