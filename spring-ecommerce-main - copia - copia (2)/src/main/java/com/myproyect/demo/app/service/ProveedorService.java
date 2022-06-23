package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Proveedor;
import com.myproyect.demo.app.interfaceService.IProveedorService;
import com.myproyect.demo.app.repository.IProveedor;

@Service
public class ProveedorService implements IProveedorService {

	@Autowired
	private IProveedor data;
	
	@Override
	public List<Proveedor> Listar() {
		
		return (List<Proveedor>)data.findAll();
	}

	@Override
	public Optional<Proveedor> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Proveedor prov) {
		int res=0;
		Proveedor proveedor=data.save(prov);
		if (!proveedor.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
