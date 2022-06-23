package com.myproyect.demo.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Insumos;

@Repository
public interface IInsumos  extends CrudRepository<Insumos, Integer>{

}
