package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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

@Entity
@Table(name="Rol")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private Integer idRol;
    @Column(name = "nomRol",length = 20)
    private String nomRol;
    @Column(name = "descripcion",length = 255)
    private String descripcion;
    @Column(name = "estado")
    private String estado;
    @JoinTable(name = "rol_permiso", joinColumns = {
        @JoinColumn(name = "Id_Rol", referencedColumnName = "idRol")}, inverseJoinColumns = {
        @JoinColumn(name = "Id_Permiso", referencedColumnName = "Id_Permiso")})
    @ManyToMany
    private List<PermisoAcceso> permisoAccesoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolidRol")
    private List<Agentes> agentesList;
    @OneToMany(mappedBy = "idRol")
    private List<Usuario> usuarioList;
    
    public Rol() {
    	
    }

	public Rol(Integer idRol, String nomRol, String descripcion, String estado, List<PermisoAcceso> permisoAccesoList,
			List<Agentes> agentesList, List<Usuario> usuarioList) {
		super();
		this.idRol = idRol;
		this.nomRol = nomRol;
		this.descripcion = descripcion;
		this.estado = estado;
		this.permisoAccesoList = permisoAccesoList;
		this.agentesList = agentesList;
		this.usuarioList = usuarioList;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNomRol() {
		return nomRol;
	}

	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<PermisoAcceso> getPermisoAccesoList() {
		return permisoAccesoList;
	}

	public void setPermisoAccesoList(List<PermisoAcceso> permisoAccesoList) {
		this.permisoAccesoList = permisoAccesoList;
	}

	public List<Agentes> getAgentesList() {
		return agentesList;
	}

	public void setAgentesList(List<Agentes> agentesList) {
		this.agentesList = agentesList;
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