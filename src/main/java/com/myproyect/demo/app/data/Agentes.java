package com.myproyect.demo.app.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Agentes")
public class Agentes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAgente")
    private Integer idAgente;
	@Column(name="Nombre",length = 50)
	String nombre;
	@Column(name="Apellido", length = 50)
	String apellido;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "Celular")
    private String celular;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "rol_idRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false)
    private Rol rolidRol;
    
    public Agentes() {
    	
    }
    
	public Agentes(Integer idAgente, String nombre, String apellido, String correo, String contrasena, String celular,
			String estado, Rol rolidRol) {
		super();
		this.idAgente = idAgente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;
		this.celular = celular;
		this.estado = estado;
		this.rolidRol = rolidRol;
	}

	public Integer getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Rol getRolidRol() {
		return rolidRol;
	}

	public void setRolidRol(Rol rolidRol) {
		this.rolidRol = rolidRol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
