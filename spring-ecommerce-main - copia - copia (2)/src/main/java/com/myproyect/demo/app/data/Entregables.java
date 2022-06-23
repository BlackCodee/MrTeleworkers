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
    @Column(name = "Hora_Entrega")
    @Temporal(TemporalType.TIME)
    private Date horaEntrega;
    @Column(name = "Fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Column(name = "Formato")
    private byte[] formato;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @JoinColumn(name = "Id_Actividad", referencedColumnName = "Id_Actividad")
    @ManyToOne
    private ActividadLaboral idActividad;
    
    public Entregables() {
    	
    }

	public Entregables(Integer idEntregables, Date horaEntrega, Date fechaEntrega, byte[] formato,
			String estado, Usuario idUsuario, ActividadLaboral idActividad) {
		super();
		this.idEntregables = idEntregables;
		this.horaEntrega = horaEntrega;
		this.fechaEntrega = fechaEntrega;
		this.formato = formato;
		this.estado = estado;
		this.idUsuario = idUsuario;
		this.idActividad = idActividad;
	}

	public Integer getIdEntregables() {
		return idEntregables;
	}

	public void setIdEntregables(Integer idEntregables) {
		this.idEntregables = idEntregables;
	}

	public Date getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(Date horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public byte[] getFormato() {
		return formato;
	}

	public void setFormato(byte[] formato) {
		this.formato = formato;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
