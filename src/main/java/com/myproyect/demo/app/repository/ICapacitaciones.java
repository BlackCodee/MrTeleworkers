package com.myproyect.demo.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Capacitaciones;

@Repository
public interface ICapacitaciones extends JpaRepository<Capacitaciones, Integer>{
	@Query(value="SELECT * FROM capacitaciones WHERE id_capacitacion=?",nativeQuery = true)
 	public Capacitaciones findIdCapacitacion(int id);
	
	public Capacitaciones findByIdCapacitacion(int idCapacitacion);
}
