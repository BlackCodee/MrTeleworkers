package com.myproyect.demo.app.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AgentesSoli")

public class AgentesSoli implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idSoli;
    @Column(name = "Nombre",length = 20)
    private String nombre;
    @Column(name = "Tipo_falla",length = 20)
    private String tipo_falla;
    @Column(name = "Descripcion",length = 80)
    private String Descripcion;
    @Column(name = "Estado",length = 30)
    private String Estado;
    @Column(name = "Celular",length = 20)
    private String celular;
    @Column(name = "prioridad",length = 20)
    private String Prioridad;
    @Column(name = "puntaje",length = 20)
    private Integer Puntaje;
    
public AgentesSoli() {
    	
    }

public AgentesSoli(Integer idSoli, String nombre, String tipo_falla, String descripcion, String estado, String celular,
		String prioridad, int puntaje) {
	super();
	this.idSoli = idSoli;
	this.nombre = nombre;
	this.tipo_falla = tipo_falla;
	Descripcion = descripcion;
	Estado = estado;
	this.celular = celular;
	Prioridad = prioridad;
	Puntaje = puntaje;
}

public Integer getIdSoli() {
	return idSoli;
}

public void setIdSoli(Integer idSoli) {
	this.idSoli = idSoli;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
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

public String getEstado() {
	return Estado;
}

public void setEstado(String estado) {
	Estado = estado;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getPrioridad() {
	return Prioridad;
}

public void setPrioridad(String prioridad) {
	Prioridad = prioridad;
}

public int getPuntaje() {
	return Puntaje;
}

public void setPuntaje(int puntaje) {
	Puntaje = puntaje;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}



}

