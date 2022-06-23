package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Insumos")
public class Insumos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Insumo")
    private Integer idInsumo;
    @Column(name = "Descripcion",length = 255)
    private String descripcion;
    @Column(name = "Id_Proveedor")
    private Integer idProveedor;
    @Column(name = "Nombre_Insumo",length = 15)
    private String nombreInsumo;
    @Column(name = "Cantidad_Disponible",length = 10)
    private String cantidadDisponible;
    @Column(name = "Id_Usuario")
    private int idUsuario;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "Id_Inventario", referencedColumnName = "Id_Inventario")
    @ManyToOne(optional = false)
    private Inventarios idInventario;
    @OneToMany(mappedBy = "idInsumo")
    private List<Pedidos> pedidosList;
    
    public Insumos() {
    	
    }

	public Insumos(Integer idInsumo, String descripcion, Integer idProveedor, String nombreInsumo,
			String cantidadDisponible, int idUsuario, String estado, Inventarios idInventario,
			List<Pedidos> pedidosList) {
		super();
		this.idInsumo = idInsumo;
		this.descripcion = descripcion;
		this.idProveedor = idProveedor;
		this.nombreInsumo = nombreInsumo;
		this.cantidadDisponible = cantidadDisponible;
		this.idUsuario = idUsuario;
		this.estado = estado;
		this.idInventario = idInventario;
		this.pedidosList = pedidosList;
	}

	public Integer getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(Integer idInsumo) {
		this.idInsumo = idInsumo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreInsumo() {
		return nombreInsumo;
	}

	public void setNombreInsumo(String nombreInsumo) {
		this.nombreInsumo = nombreInsumo;
	}

	public String getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(String cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Inventarios getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Inventarios idInventario) {
		this.idInventario = idInventario;
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
