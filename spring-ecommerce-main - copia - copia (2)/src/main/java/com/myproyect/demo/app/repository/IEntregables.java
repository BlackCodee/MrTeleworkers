package com.myproyect.demo.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Entregables;

@Repository
public interface IEntregables  extends CrudRepository<Entregables, Integer>{

}
