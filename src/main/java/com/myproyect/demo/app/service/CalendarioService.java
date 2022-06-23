package com.myproyect.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproyect.demo.app.data.Calendario;
import com.myproyect.demo.app.interfaceService.ICalendarioService;
import com.myproyect.demo.app.repository.ICalendario;

@Service
public class CalendarioService implements ICalendarioService {

	@Autowired
	private ICalendario data;
	
	@Override
	public List<Calendario> Listar() {
		
		return (List<Calendario>)data.findAll();
	}

	@Override
	public Optional<Calendario> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Calendario cal) {
		int res=0;
		Calendario calendario=data.save(cal);
		if (!calendario.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}
	

}
