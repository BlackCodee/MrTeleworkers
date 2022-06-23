package com.myproyect.demo.app.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UsuariosSoli")

public class UsuariosSoli implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Nombre",length = 20)
    private String nombre;
    @Column(name = "Celular",length = 20)
    private String celular;
    @Column(name = "Tipo_falla",length = 20)
    private String tipo_falla;
    @Column(name = "Descripcion",length = 80)
    private String Descripcion;
    
public UsuariosSoli() {
    	
    }

public UsuariosSoli(Integer id, String nombre, String celular, String tipo_falla, String descripcion) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.celular = celular;
	this.tipo_falla = tipo_falla;
	Descripcion = descripcion;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getTipo_falla() {
	return tipo_falla;
}

public void setTipo_falla(String tipo_falla) {
	this.tipo_falla = tipo_falla;
}

public String getDescripcion() {
	return Descripcion;
}

public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

    




	
}
