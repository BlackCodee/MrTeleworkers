package com.myproyect.demo.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.myproyect.demo.app.data.UsuarioInfo;



public interface IUsuarioInfo extends CrudRepository<UsuarioInfo, Integer> {
	
	

}
