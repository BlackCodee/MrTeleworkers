package com.myproyect.demo.app.repository;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Computador;

@Repository
public interface IComputador extends JpaRepository<Computador, Integer>{
	@Query(value="SELECT * FROM COMPUTADOR WHERE ID_COMPUTADOR=?",nativeQuery = true)
 	public Computador findId(int id);
}
