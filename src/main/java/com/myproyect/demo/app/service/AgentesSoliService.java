package com.myproyect.demo.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myproyect.demo.app.data.AgentesSoli;
import com.myproyect.demo.app.interfaceService.IAgentesSoliService;
import com.myproyect.demo.app.repository.IAgentesSoli;


@Service
public class AgentesSoliService implements IAgentesSoliService {
	
	@Autowired
	private IAgentesSoli data;

	@Override
	public List<AgentesSoli> Listar() {
		
		return (List<AgentesSoli>)data.findAll();
	}

	@Override
	public Optional<AgentesSoli> ListarId(int idSoli) {
		
		return data.findById(idSoli);
	}

	@Override
	public int save(AgentesSoli ags) {
		int res=0;
		AgentesSoli agentesSoli=data.save(ags);
		if (!agentesSoli.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idSoli) {
		data.deleteById(idSoli);
		
	}

	

}
