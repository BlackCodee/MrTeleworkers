package com.myproyect.demo.app.clases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeveloperTutorialService implements IDeveloper_TutorialService{

	@Autowired
	private IDeveloperTutorial data;

	@Override
	public List<DeveloperTutorial> Listar() {
		return(List<DeveloperTutorial>)data.findAll();
	}
	

}
