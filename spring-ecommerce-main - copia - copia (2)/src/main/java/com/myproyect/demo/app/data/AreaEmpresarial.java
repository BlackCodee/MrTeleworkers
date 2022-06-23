package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AreaEmpresarial")
public class AreaEmpresarial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Area")
    private Integer idArea;
    @Column(name = "Nombre_Area")
    private String nombreArea;
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idArea")
    private List<ActividadLaboral> actividadLaboralList;
    @OneToMany(mappedBy = "areaidArea")
    private List<Usuario> usuarioList;
    
    public AreaEmpresarial() {}

	public AreaEmpresarial(Integer idArea, String nombreArea, String estado,
			List<ActividadLaboral> actividadLaboralList, List<Usuario> usuarioList) {
		super();
		this.idArea = idArea;
		this.nombreArea = nombreArea;
		this.estado = estado;
		this.actividadLaboralList = actividadLaboralList;
		this.usuarioList = usuarioList;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<ActividadLaboral> getActividadLaboralList() {
		return actividadLaboralList;
	}

	public void setActividadLaboralList(List<ActividadLaboral> actividadLaboralList) {
		this.actividadLaboralList = actividadLaboralList;
	}

	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}

	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
    
	
    
}
