package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Entregables")
public class Entregables implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Entregables")
    private Integer idEntregables;
    @Column(name = "Fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Column(name = "Hora_Entrega")
    @Temporal(TemporalType.TIME)
    //@DateTimeFormat(pattern="HH:mm:ss")
    private Date horaEntrega;
    @Column(name = "Enlace", length = 255)
    private String enlace;
    @Column(name = "estado")
    private String estado;
    @Column(name = "comentario", length = 255)
    private String comentario;
    @Column(name = "revisado")
    private String revisado;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "Id_Actividad", referencedColumnName = "Id_Actividad")
    @ManyToOne
    private ActividadLaboral idActividad;
    
    public Entregables() {
    	
    }

	public Entregables(Integer idEntregables, Date fechaEntrega, Date horaEntrega, String enlace,
			String estado, String comentario,String revisado, Usuario idUsuario, ActividadLaboral idActividad) {
		super();
		this.idEntregables = idEntregables;
		this.fechaEntrega = fechaEntrega;
		this.horaEntrega = horaEntrega;
		this.enlace = enlace;
		this.estado = estado;
		this.comentario = comentario;
		this.revisado = revisado;
		this.idUsuario = idUsuario;
		this.idActividad = idActividad;
	}

	public Integer getIdEntregables() {
		return idEntregables;
	}

	public void setIdEntregables(Integer idEntregables) {
		this.idEntregables = idEntregables;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(Date horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getRevisado() {
		return revisado;
	}

	public void setRevisado(String revisado) {
		this.revisado = revisado;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public ActividadLaboral getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(ActividadLaboral idActividad) {
		this.idActividad = idActividad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

	
	

}
