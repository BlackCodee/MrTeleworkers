package com.myproyect.demo.app.repository;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Prestamos;

@Repository
public interface IPrestamos  extends JpaRepository<Prestamos, Integer>{
	@Query(value="SELECT * FROM PRESTAMOS WHERE ID_PRESTAMO=?",nativeQuery = true)
 	public Prestamos findId(int id);
}
