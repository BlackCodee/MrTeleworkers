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

import lombok.Data;

@Data
@Entity
@Table(name="Proveedor")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Proveedor")
    private Integer idProveedor;
    @Column(name = "Nombre_Proveedor",length = 25)
    private String nombreProveedor;
    @Column(name = "estado")
    private String estado;
    @Column(name = "correo_proveedor")
    private String correo;
    @Column(name = "telefono")
    private Integer telefono;
    @OneToMany(mappedBy = "idProveedor")
    private List<Pedidos> pedidosList;
    
    public Proveedor() {
    	
    }
    
	public Proveedor(Integer idProveedor, String nombreProveedor, String estado, String correo,Integer telefono, List<Pedidos> pedidosList) {
		super();
		this.idProveedor = idProveedor;
		this.nombreProveedor = nombreProveedor;
		this.estado = estado;
		this.correo = correo;
		this.telefono = telefono;
		this.pedidosList = pedidosList;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Pedidos> getPedidosList() {
		return pedidosList;
	}

	public void setPedidosList(List<Pedidos> pedidosList) {
		this.pedidosList = pedidosList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}