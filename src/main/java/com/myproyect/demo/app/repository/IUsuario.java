package com.myproyect.demo.app.repository;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByEmail(String email);
	/*extends CrudRepository<Usuario, Integer>{*/
	@Query(value="SELECT * FROM USUARIOS WHERE ID_USUARIO=?",nativeQuery = true)
 	public Usuario findId(int id);
	
	/*public Usuario findByEmailAndContrasena(String email, String contrasena);*/
}
