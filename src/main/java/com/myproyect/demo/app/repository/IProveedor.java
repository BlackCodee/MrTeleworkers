package com.myproyect.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Proveedor;

@Repository
public interface IProveedor  extends JpaRepository<Proveedor, Integer>{

}
