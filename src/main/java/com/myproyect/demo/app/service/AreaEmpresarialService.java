package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.AreaEmpresarial;
import com.myproyect.demo.app.interfaceService.IAreaEmpresarialService;
import com.myproyect.demo.app.repository.IAreaEmpresarial;

@Service
public class AreaEmpresarialService implements IAreaEmpresarialService {

	@Autowired
	private IAreaEmpresarial data;
	
	@Override
	public List<AreaEmpresarial> Listar() {
		
		return (List<AreaEmpresarial>)data.findAll();
	}

	@Override
	public Optional<AreaEmpresarial> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(AreaEmpresarial ae) {
		int res=0;
		AreaEmpresarial areaEmpresarial=data.save(ae);
		if (!areaEmpresarial.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
