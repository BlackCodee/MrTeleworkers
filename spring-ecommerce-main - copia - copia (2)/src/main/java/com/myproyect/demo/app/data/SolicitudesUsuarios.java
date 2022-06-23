package com.myproyect.demo.app.data;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SolicitudesUsuarios")
public class SolicitudesUsuarios implements Serializable{

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
    @Column(name = "Descripcion",length = 20)
    private String Descripcion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitudesUsuarios")
    private Canales canales;
    @JoinColumn(name = "id", referencedColumnName = "idSolicitud", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Solicitudes solicitudes;
    
    public SolicitudesUsuarios() {
    	
    }
    
    
    
	

	public SolicitudesUsuarios(Integer id, String nombre, String celular, String tipo_falla, String descripcion,
			Canales canales, Solicitudes solicitudes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.celular = celular;
		this.tipo_falla = tipo_falla;
		Descripcion = descripcion;
		this.canales = canales;
		this.solicitudes = solicitudes;
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





	public Canales getCanales() {
		return canales;
	}





	public void setCanales(Canales canales) {
		this.canales = canales;
	}





	public Solicitudes getSolicitudes() {
		return solicitudes;
	}





	public void setSolicitudes(Solicitudes solicitudes) {
		this.solicitudes = solicitudes;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
