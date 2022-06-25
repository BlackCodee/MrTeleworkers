package com.myproyect.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Agentes;

@Repository
public interface IAgentes  extends JpaRepository<Agentes, Integer>{
	
	@Query(value="SELECT * FROM agentes WHERE id_agente=?",nativeQuery = true)
 	public List<Agentes> findAgentes(int idAgente);
	
	
	
	
	public Agentes findByIdAgente(int idAgente);

}
