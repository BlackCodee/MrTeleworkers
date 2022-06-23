package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Inventarios")
public class Inventarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Inventario")
    private Integer idInventario;
    @Column(name = "Stock")
    private int stock;
    @Column(name = "Id_Usuario")
    private int idUsuario;
    @Column(name = "Nombre_Inventario",length = 15)
    private String nombreInventario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInventario")
    private List<Insumos> insumosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInventario")
    private List<Computador> computadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInventario")
    private List<Usuario> usuarioList;
    
    public Inventarios() {
    	
    }
    
	public Inventarios(Integer idInventario, int stock, int idUsuario, String nombreInventario,
			List<Insumos> insumosList, List<Computador> computadorList, List<Usuario> usuarioList) {
		super();
		this.idInventario = idInventario;
		this.stock = stock;
		this.idUsuario = idUsuario;
		this.nombreInventario = nombreInventario;
		this.insumosList = insumosList;
		this.computadorList = computadorList;
		this.usuarioList = usuarioList;
	}

	public Integer getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Integer idInventario) {
		this.idInventario = idInventario;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreInventario() {
		return nombreInventario;
	}

	public void setNombreInventario(String nombreInventario) {
		this.nombreInventario = nombreInventario;
	}

	public List<Insumos> getInsumosList() {
		return insumosList;
	}

	public void setInsumosList(List<Insumos> insumosList) {
		this.insumosList = insumosList;
	}

	public List<Computador> getComputadorList() {
		return computadorList;
	}

	public void setComputadorList(List<Computador> computadorList) {
		this.computadorList = computadorList;
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

