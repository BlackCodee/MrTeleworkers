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
@Table(name="Prestamos")
public class Prestamos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Prestamo")
    private Integer idPrestamo;
    @Column(name = "Nombres_Usuario",length = 50)
    private String nombresUsuario;
    @Column(name = "Id_Usuario")
    private Integer idUsuario;
    @Column(name = "Cantidad")
    private Integer cantidad;
    @Column(name = "Detalle",length = 255)
    private String detalle;
    @Column(name = "Telefono",length = 15)
    private String telefono;
    @Column(name = "Email",length = 25)
    private String email;
    @Column(name = "Estado",length = 25)
    private String estado;
    @JoinColumn(name = "Id_Computador", referencedColumnName = "Id_Computador")
    @ManyToOne(optional = false)
    private Computador idComputador;
    
    public Prestamos() {
    	
    }

	public Prestamos(Integer idPrestamo, String nombresUsuario, Integer idUsuario, Integer cantidad, String detalle,
			String telefono, String email, String estado, Computador idComputador) {
		super();
		this.idPrestamo = idPrestamo;
		this.nombresUsuario = nombresUsuario;
		this.idUsuario = idUsuario;
		this.cantidad = cantidad;
		this.detalle = detalle;
		this.telefono = telefono;
		this.email = email;
		this.estado = estado;
		this.idComputador = idComputador;
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public String getNombresUsuario() {
		return nombresUsuario;
	}

	public void setNombresUsuario(String nombresUsuario) {
		this.nombresUsuario = nombresUsuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Computador getIdComputador() {
		return idComputador;
	}

	public void setIdComputador(Computador idComputador) {
		this.idComputador = idComputador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	

}