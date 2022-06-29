package com.myproyect.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Proveedor;

@Repository
public interface IProveedor  extends JpaRepository<Proveedor, Integer>{
	
	@Query(value="SELECT * FROM PROVEEDOR WHERE ID_PROVEEDOR=?",nativeQuery = true)
	public List<Proveedor> findProveedor(int idProveedor);
	
	@Query(value="SELECT COUNT(*) FROM `proveedor` pro WHERE pro.estado = 'activo'",nativeQuery = true)
 	public int proveedoresActivos();
	
	public Proveedor findByIdProveedor(int idProveedor);
}
