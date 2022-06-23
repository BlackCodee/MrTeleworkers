package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Capacitaciones")
public class Capacitaciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Capacitacion")
    private Integer idCapacitacion;
    @Column(name = "Fecha")
    @Temporal (TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fecha;
    @Column(name = "Hora")
    @Temporal (TemporalType.TIME)
    @DateTimeFormat(pattern="HH:mm:ss")
    private Date hora;
    @Column(name = "Nombre_Encargado")
    private String nombreEncargado;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Nombre_Capacitacion")
    private String nombreCapacitacion;
    @Column(name = "estado")
    private String estado;
    @Column(name = "DNI")
    private int dni;
    @Column(name = "Email")
    private String email;
    @Column(name = "Telefono")
    private int telefono;
    @Column(name = "enlace", length = 255)
    private String enlace;
    @JoinTable(name = "usuario_capacitacion", joinColumns = {
    @JoinColumn(name = "Id_Capacitacion", referencedColumnName = "Id_Capacitacion")}, inverseJoinColumns = {
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")})
    @ManyToMany
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "idCapacitacion")
    private List<Inscripcion> inscripcionList;
    
    public Capacitaciones() {
    	
    }
    
	public Capacitaciones(Integer idCapacitacion, Date fecha, Date hora, String nombreEncargado, String descripcion,
			String nombreCapacitacion, String estado, int dni, String email, int telefono, String enlace, List<Usuario> usuarioList,
			List<Inscripcion> inscripcionList) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.fecha = fecha;
		this.hora = hora;
		this.nombreEncargado = nombreEncargado;
		this.descripcion = descripcion;
		this.nombreCapacitacion = nombreCapacitacion;
		this.estado = estado;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.enlace = enlace;
		this.usuarioList = usuarioList;
		this.inscripcionList = inscripcionList;
	}

	public Integer getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getNombreEncargado() {
		return nombreEncargado;
	}

	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}

	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}

	public List<Inscripcion> getInscripcionList() {
		return inscripcionList;
	}

	public void setInscripcionList(List<Inscripcion> inscripcionList) {
		this.inscripcionList = inscripcionList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
