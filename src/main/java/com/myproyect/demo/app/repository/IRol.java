package com.myproyect.demo.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Rol;

@Repository
public interface IRol  extends CrudRepository<Rol, Integer>{
	@Query(value="SELECT * FROM ROL WHERE ID_ROL=?1",nativeQuery = true)
	public Rol findId(int id);
}
