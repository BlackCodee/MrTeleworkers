package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="Solicitudes")
public class Solicitudes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSolicitud")
    private Integer idSolicitud;
    @Column(name = "tipoIncidente",length = 25)
    private String tipoIncidente;
    @Column(name = "prioridad",length = 25)
    private String prioridad;
    @Column(name = "descripcion",length = 255)
    private String descripcion;
    @Column(name = "estado1",length = 25)
    private String estado1;
    @Column(name = "Fecha_de_Solicitud")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date solicitado;
    @Column(name = "rol_idRol")
    private int rolidRol;
    @Column(name = "estado")
    private String estado;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "solicitudes")
    private SolicitudesUsuarios solicitudesUsuarios;
    
    public Solicitudes() {
    	
    }
    
	public Solicitudes(Integer idSolicitud, String tipoIncidente, String prioridad, String descripcion, String estado1,
			Date solicitado, int rolidRol, String estado, SolicitudesUsuarios solicitudesUsuarios) {
		super();
		this.idSolicitud = idSolicitud;
		this.tipoIncidente = tipoIncidente;
		this.prioridad = prioridad;
		this.descripcion = descripcion;
		this.estado1 = estado1;
		this.solicitado = solicitado;
		this.rolidRol = rolidRol;
		this.estado = estado;
		this.solicitudesUsuarios = solicitudesUsuarios;
	}

	public Integer getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getTipoIncidente() {
		return tipoIncidente;
	}

	public void setTipoIncidente(String tipoIncidente) {
		this.tipoIncidente = tipoIncidente;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado1() {
		return estado1;
	}

	public void setEstado1(String estado1) {
		this.estado1 = estado1;
	}

	public Date getSolicitado() {
		return solicitado;
	}

	public void setSolicitado(Date solicitado) {
		this.solicitado = solicitado;
	}

	public int getRolidRol() {
		return rolidRol;
	}

	public void setRolidRol(int rolidRol) {
		this.rolidRol = rolidRol;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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