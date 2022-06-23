package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PermisoAcceso")
public class PermisoAcceso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Permiso")
    private Integer idPermiso;
    @Column(name = "Acceso",length = 255)
    private String acceso;
    @ManyToMany(mappedBy = "permisoAccesoList")
    private List<Rol> rolList;
    
    public PermisoAcceso() {
    	
    }
    
	public PermisoAcceso(Integer idPermiso, String acceso, List<Rol> rolList) {
		super();
		this.idPermiso = idPermiso;
		this.acceso = acceso;
		this.rolList = rolList;
	}

	public Integer getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(Integer idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	public List<Rol> getRolList() {
		return rolList;
	}

	public void setRolList(List<Rol> rolList) {
		this.rolList = rolList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
