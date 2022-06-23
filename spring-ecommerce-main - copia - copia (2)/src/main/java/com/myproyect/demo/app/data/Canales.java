package com.myproyect.demo.app.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Canales")
public class Canales implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Canal")
    private Integer idCanal;
    @Column(name = "Nombre_Canal")
    private String nombreCanal;
    @Column(name = "Descripcion_Canal")
    private String descripcionCanal;
    @JoinColumn(name = "id_Canal", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SolicitudesUsuarios solicitudesUsuarios;
    
    public Canales() {
    	
    }
    
	public Canales(Integer idCanal, String nombreCanal, String descripcionCanal,
			SolicitudesUsuarios solicitudesUsuarios) {
		super();
		this.idCanal = idCanal;
		this.nombreCanal = nombreCanal;
		this.descripcionCanal = descripcionCanal;
		this.solicitudesUsuarios = solicitudesUsuarios;
	}

	public Integer getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(Integer idCanal) {
		this.idCanal = idCanal;
	}

	public String getNombreCanal() {
		return nombreCanal;
	}

	public void setNombreCanal(String nombreCanal) {
		this.nombreCanal = nombreCanal;
	}

	public String getDescripcionCanal() {
		return descripcionCanal;
	}

	public void setDescripcionCanal(String descripcionCanal) {
		this.descripcionCanal = descripcionCanal;
	}

	public SolicitudesUsuarios getSolicitudesUsuarios() {
		return solicitudesUsuarios;
	}

	public void setSolicitudesUsuarios(SolicitudesUsuarios solicitudesUsuarios) {
		this.solicitudesUsuarios = solicitudesUsuarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
