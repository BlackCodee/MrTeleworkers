package com.myproyect.demo.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.UsuariosSoli;

@Repository
public interface IUsuariosSoli extends CrudRepository<UsuariosSoli, Integer>{

}
