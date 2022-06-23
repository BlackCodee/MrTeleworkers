package com.myproyect.demo.app.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UsuarioInfo")
public class UsuarioInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idusu;
    @Column(name = "Nombre",length = 20)
    private String nombre;
    @Column(name = "Apellido",length = 20)
    private String apellido;
    @Column(name = "Celular",length = 20)
    private String celular;
    @Column(name = "Correo",length = 20)
    private String correo;
    @Column(name = "Rol",length = 20)
    private String rol;
    @Column(name = "Area",length = 20)
    private String area;
    @Column(name = "Modalidad",length = 20)
    private String modalidad;
    
    
public UsuarioInfo() {
    	
    }


public UsuarioInfo(Integer idusu, String nombre, String apellido, String celular, String correo, String rol,
		String area, String modalidad) {
	super();
	this.idusu = idusu;
	this.nombre = nombre;
	this.apellido = apellido;
	this.celular = celular;
	this.correo = correo;
	this.rol = rol;
	this.area = area;
	this.modalidad = modalidad;
}


public Integer getIdusu() {
	return idusu;
}


public void setIdusu(Integer idusu) {
	this.idusu = idusu;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getCelular() {
	return celular;
}


public void setCelular(String celular) {
	this.celular = celular;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public String getRol() {
	return rol;
}


public void setRol(String rol) {
	this.rol = rol;
}


public String getArea() {
	return area;
}


public void setArea(String area) {
	this.area = area;
}


public String getModalidad() {
	return modalidad;
}


public void setModalidad(String modalidad) {
	this.modalidad = modalidad;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


	
	
	

}
