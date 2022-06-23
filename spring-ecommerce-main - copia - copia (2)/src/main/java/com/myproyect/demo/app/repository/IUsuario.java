package com.myproyect.demo.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproyect.demo.app.data.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByEmail(String email);
	/*extends CrudRepository<Usuario, Integer>{
	@Query(value="SELECT * FROM USUARIO WHERE ID_USUARIO=?1",nativeQuery = true)
 	public Usuario findId(int id);
	
	public Usuario findByEmailAndContrasena(String email, String contrasena);*/
}
