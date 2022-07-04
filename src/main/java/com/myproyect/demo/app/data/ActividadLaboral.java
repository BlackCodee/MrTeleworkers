package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="ActividadLaboral")
public class ActividadLaboral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Actividad")
    private Integer idActividad;
	@Column(name="Nombre_Actividad", length = 100)
	String Nombre_Actividad;
    @Column(name = "Fecha_Modificacion")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @Column(name = "Fecha_Entrega")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Column(name = "Hora_Entrega")
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern="HH:mm")
    private Date horaEntrega;
    @Column(name = "Descripcion" ,length = 200)
    private String descripcion;
    @Column(name = "entregable" ,length = 50)
    private String entregable;
    @Column(name = "estado")
    private String estado;
    @ManyToMany(mappedBy = "actividadLaboralList")
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "idActividad")
    private List<Calendario> calendarioList;
    @JoinColumn(name="Id_Area", referencedColumnName = "Id_Area")
    @ManyToOne
    private AreaEmpresarial idArea;
    @OneToMany(mappedBy = "idActividad")
    private List<Entregables> entregablesList;
	
    public ActividadLaboral() {
    	
    }
    
    public ActividadLaboral(Integer idActividad, String nombre_Actividad, Date fechaModificacion,
			Date fechaEntrega, Date horaEntrega, String descripcion, String entregable, String estado,
			List<Usuario> usuarioList, List<Calendario> calendarioList, AreaEmpresarial idArea,
			List<Entregables> entregablesList) {
		super();
		this.idActividad = idActividad;
		Nombre_Actividad = nombre_Actividad;
		this.fechaModificacion = fechaModificacion;
		this.fechaEntrega = fechaEntrega;
		this.horaEntrega = horaEntrega;
		this.descripcion = descripcion;
		this.entregable = entregable;
		this.estado = estado;
		this.usuarioList = usuarioList;
		this.calendarioList = calendarioList;
		this.idArea = idArea;
		this.entregablesList = entregablesList;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public String getNombre_Actividad() {
		return Nombre_Actividad;
	}

	public void setNombre_Actividad(String nombre_Actividad) {
		Nombre_Actividad = nombre_Actividad;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEntregable() {
		return entregable;
	}

	public void setEntregable(String entregable) {
		this.entregable = entregable;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}

	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}

	public List<Calendario> getCalendarioList() {
		return calendarioList;
	}

	public void setCalendarioList(List<Calendario> calendarioList) {
		this.calendarioList = calendarioList;
	}

	public AreaEmpresarial getIdArea() {
		return idArea;
	}

	public void setIdArea(AreaEmpresarial idArea) {
		this.idArea = idArea;
	}

	public List<Entregables> getEntregablesList() {
		return entregablesList;
	}

	public void setEntregablesList(List<Entregables> entregablesList) {
		this.entregablesList = entregablesList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
