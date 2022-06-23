package com.myproyect.demo.app.clases;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface DeveloperTutorialRepository extends JpaRepository<DeveloperTutorial, Integer>{
	}

