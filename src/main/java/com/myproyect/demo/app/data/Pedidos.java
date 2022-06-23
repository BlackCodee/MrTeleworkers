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
import lombok.Data;

@Data
@Entity
@Table(name="Pedidos")
public class Pedidos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Pedido")
    private Integer idPedido;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Detalle_pedido",length = 60)
    private String detallepedido;
    @Column(name = "estado",length = 60)
    private String estado;
    @Column(name = "Precio_pedido")
    private int preciopedido;
    @Column(name = "Nombre_insumo",length = 50)
    private String nombreinsumo;
    @Column(name = "Id_Usuario")
    private int idUsuario;
    @JoinColumn(name = "Id_Insumo", referencedColumnName = "Id_Insumo")
    @ManyToOne
    private Insumos idInsumo;
    @JoinColumn(name = "Id_Proveedor", referencedColumnName = "Id_Proveedor")
    @ManyToOne
    private Proveedor idProveedor;
    
    public Pedidos() {
    	
    }
    
	public Pedidos(Integer idPedido, int cantidad, String detallepedido,String estado, int preciopedido,
			String nombreinsumo, int idUsuario, Insumos idInsumo, Proveedor idProveedor) {
		super();
		this.idPedido = idPedido;
		this.cantidad = cantidad;
		this.detallepedido = detallepedido;
		this.estado = estado;
		this.preciopedido = preciopedido;
		this.nombreinsumo = nombreinsumo;
		this.idUsuario = idUsuario;
		this.idInsumo = idInsumo;
		this.idProveedor = idProveedor;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDetallepedido() {
		return detallepedido;
	}

	public void setDetallepedido(String detallepedido) {
		this.detallepedido = detallepedido;
	}
	
	public void setPreciopedido(Integer preciopedido) {
		this.preciopedido = preciopedido;
	}

	public int getPreciopedido() {
		return preciopedido;
	}
	
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}


	public String getNombreinsumo() {
		return nombreinsumo;
	}

	public void setNombreinsumo(String nombreinsumo) {
		this.nombreinsumo = nombreinsumo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Insumos getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(Insumos idInsumo) {
		this.idInsumo = idInsumo;
	}

	public Proveedor getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}