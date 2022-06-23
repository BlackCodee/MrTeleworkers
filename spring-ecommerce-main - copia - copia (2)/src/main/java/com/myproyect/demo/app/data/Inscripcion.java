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

@Entity
@Table(name="Inscripcion")
public class Inscripcion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Inscripcion")
    private Integer idInscripcion;
    @Column(name = "Nombre_Empleado" ,length = 50)
    private String nombreEmpleado;
    @Column(name = "DNI_Empleado")
    private Integer dNIEmpleado;
    @Column(name = "Area_Empresarial" ,length = 30)
    private String areaEmpresarial;
    @Column(name = "Genero" ,length = 10)
    private String genero;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "Id_Capacitacion", referencedColumnName = "Id_Capacitacion")
    @ManyToOne
    private Capacitaciones idCapacitacion;
    
    public Inscripcion() {
    	
    }
    
	public Inscripcion(Integer idInscripcion, String nombreEmpleado, Integer dNIEmpleado, String areaEmpresarial,
			String genero, Usuario idUsuario, Capacitaciones idCapacitacion) {
		super();
		this.idInscripcion = idInscripcion;
		this.nombreEmpleado = nombreEmpleado;
		this.dNIEmpleado = dNIEmpleado;
		this.areaEmpresarial = areaEmpresarial;
		this.genero = genero;
		this.idUsuario = idUsuario;
		this.idCapacitacion = idCapacitacion;
	}

	public Integer getIdInscripcion() {
		return idInscripcion;
	}

	public void setIdInscripcion(Integer idInscripcion) {
		this.idInscripcion = idInscripcion;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public Integer getdNIEmpleado() {
		return dNIEmpleado;
	}

	public void setdNIEmpleado(Integer dNIEmpleado) {
		this.dNIEmpleado = dNIEmpleado;
	}

	public String getAreaEmpresarial() {
		return areaEmpresarial;
	}

	public void setAreaEmpresarial(String areaEmpresarial) {
		this.areaEmpresarial = areaEmpresarial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Capacitaciones getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Capacitaciones idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}

