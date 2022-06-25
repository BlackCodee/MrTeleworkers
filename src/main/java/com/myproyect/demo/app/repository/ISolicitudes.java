package com.myproyect.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Solicitudes;

@Repository
public interface ISolicitudes  extends JpaRepository<Solicitudes, Integer>{

	@Query(value="SELECT * FROM solicitudes WHERE id_solicitud=?",nativeQuery = true)
 	public List<Solicitudes> findSolicitudes(int idSolicitud);
	
	
	
	
	public Solicitudes findByIdSolicitud(int idSolicitud);
}
