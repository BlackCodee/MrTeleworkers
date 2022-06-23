package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Agentes;
import com.myproyect.demo.app.interfaceService.IAgentesService;
import com.myproyect.demo.app.repository.IAgentes;

@Service
public class AgentesService implements IAgentesService {

	@Autowired
	private IAgentes data;
	
	@Override
	public List<Agentes> Listar() {
		
		return (List<Agentes>)data.findAll();
	}

	@Override
	public Optional<Agentes> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Agentes ag) {
		int res=0;
		Agentes agentes=data.save(ag);
		if (!agentes.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
