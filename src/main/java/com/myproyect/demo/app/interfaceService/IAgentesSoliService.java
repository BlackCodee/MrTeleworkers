package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;


import com.myproyect.demo.app.data.AgentesSoli;

public interface IAgentesSoliService {
	
	public List<AgentesSoli>Listar();
	public Optional<AgentesSoli>ListarId(int idSoli);
	public int save(AgentesSoli ags);
	public void delete(int idSoli);

}
