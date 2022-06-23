package com.myproyect.demo.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.myproyect.demo.app.data.AreaEmpresarial;

public interface IAreaEmpresarialService{
	public List<AreaEmpresarial>Listar();
	public Optional<AreaEmpresarial>ListarId(int id);
	public int save(AreaEmpresarial ae);
	public void delete(int id);
}
