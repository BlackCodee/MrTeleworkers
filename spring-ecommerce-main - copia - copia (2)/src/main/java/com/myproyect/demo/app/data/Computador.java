package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Computador")
public class Computador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Computador")
    private Integer idComputador;
    @Column(name = "Marca",length = 50)
    private String marca;
    @Column(name = "Modelo",length = 30)
    private String modelo;
    @Column(name = "Color",length = 20)
    private String color;
    @Column(name = "Descripcion",length = 250)
    private String descripcion;
    @Column(name = "Id_Usuarios")
    private int idUsuarios;
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComputador")
    private List<Prestamos> prestamosList;
    @JoinColumn(name = "Id_Inventario", referencedColumnName = "Id_Inventario")
    @ManyToOne(optional = false)
    private Inventarios idInventario;
    
    public Computador() {
    	
    }
    
	public Computador(Integer idComputador, String marca, String modelo, String color, String descripcion,
			int idUsuarios, String estado, List<Prestamos> prestamosList, Inventarios idInventario) {
		super();
		this.idComputador = idComputador;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.descripcion = descripcion;
		this.idUsuarios = idUsuarios;
		this.estado = estado;
		this.prestamosList = prestamosList;
		this.idInventario = idInventario;
	}

	public Integer getIdComputador() {
		return idComputador;
	}

	public void setIdComputador(Integer idComputador) {
		this.idComputador = idComputador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Prestamos> getPrestamosList() {
		return prestamosList;
	}

	public void setPrestamosList(List<Prestamos> prestamosList) {
		this.prestamosList = prestamosList;
	}

	public Inventarios getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Inventarios idInventario) {
		this.idInventario = idInventario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}