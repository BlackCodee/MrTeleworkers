package com.myproyect.demo.app.repository;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import com.myproyect.demo.app.data.AgentesSoli;

public interface IAgentesSoli extends JpaRepository<AgentesSoli, Integer> {
	
	@Autowired

	@Query(value="SELECT SUM(puntaje) AS Total_Solicitudes FROM agentes_soli;",nativeQuery =true)
	public String puntajeAgentes();
	
	}
	
	


