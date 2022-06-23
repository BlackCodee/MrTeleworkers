package com.myproyect.demo.app.data;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Calendario")
public class Calendario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Calendario")
    private Integer idCalendario;
	@Column(name = "title")
	private String title;
	@Column(name = "start")
	@DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	private Date start;
    @Column(name = "end")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	private Date end;
    @JoinColumn(name = "Id_Actividad", referencedColumnName = "Id_Actividad")
    @ManyToOne
    private ActividadLaboral idActividad;
    @OneToMany(mappedBy = "idCalendario")
    private List<Usuario> usuarioList;
    
    public Calendario(){
    	
    }

	public Integer getIdCalendario() {
		return idCalendario;
	}

	public void setIdCalendario(Integer idCalendario) {
		this.idCalendario = idCalendario;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public ActividadLaboral getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(ActividadLaboral idActividad) {
		this.idActividad = idActividad;
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

	public Calendario(Integer idCalendario, String title, Date start, Date end, ActividadLaboral idActividad,
			List<Usuario> usuarioList) {
		super();
		this.idCalendario = idCalendario;
		this.title = title;
		this.start = start;
		this.end = end;
		this.idActividad = idActividad;
		this.usuarioList = usuarioList;
	}
    


    
}
