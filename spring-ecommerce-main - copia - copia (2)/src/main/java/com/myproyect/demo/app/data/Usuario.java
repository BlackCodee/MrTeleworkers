package com.myproyect.demo.app.data;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usuarios")
public class Usuario {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Usuario")
    private Integer idUsuario;
    @Column(name = "DNI")
    private int dni;
    @Column(name = "Nombre",length = 50)
	private String nombre;
    @Column(name = "username",length = 50)
	private String username;
    @Column(name = "Fecha_de_nacimiento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechadenacimiento;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email",length = 30)
	private String email;
    @Column(name = "password",length = 200)
	private String password;
    @Column(name = "Horario",length = 11)
    private String horario;
    @Column(name = "Fecha_Ingreso")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
	private String tipo;
    @Column(name = "estado")
    private String estado;
    @JoinTable(name = "usuario_actividad", joinColumns = {
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")}, inverseJoinColumns = {
    @JoinColumn(name = "Id_Actividad", referencedColumnName = "Id_Actividad")})
    @ManyToMany
    private List<ActividadLaboral> actividadLaboralList;
    @ManyToMany(mappedBy = "usuarioList")
    private List<Capacitaciones> capacitacionesList;
    @OneToMany(mappedBy = "idUsuario")
    private List<Inscripcion> inscripcionList;
    @JoinColumn(name = "id_area", referencedColumnName = "Id_Area")
    @ManyToOne
    private AreaEmpresarial areaidArea;
    @JoinColumn(name = "id_rol", referencedColumnName = "idRol")
    @ManyToOne
    private Rol idRol;
    @JoinColumn(name = "id_calendario", referencedColumnName = "Id_Calendario")
    @ManyToOne
    private Calendario idCalendario;
    @JoinColumn(name = "Id_Inventario", referencedColumnName = "Id_Inventario")
    @ManyToOne(optional = false)
    private Inventarios idInventario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<Entregables> entregablesList;
	
	public Usuario() {
	}

	public Usuario(Integer idUsuario, int dni, String nombre, String username, Date fechadenacimiento, String telefono,
			String email, String password, String horario, Date fechaIngreso, String tipo, String estado,
			List<ActividadLaboral> actividadLaboralList, List<Capacitaciones> capacitacionesList,
			List<Inscripcion> inscripcionList, AreaEmpresarial areaidArea, Rol idRol, Calendario idCalendario,
			Inventarios idInventario, List<Entregables> entregablesList) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.username = username;
		this.fechadenacimiento = fechadenacimiento;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.horario = horario;
		this.fechaIngreso = fechaIngreso;
		this.tipo = tipo;
		this.estado = estado;
		this.actividadLaboralList = actividadLaboralList;
		this.capacitacionesList = capacitacionesList;
		this.inscripcionList = inscripcionList;
		this.areaidArea = areaidArea;
		this.idRol = idRol;
		this.idCalendario = idCalendario;
		this.idInventario = idInventario;
		this.entregablesList = entregablesList;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getFechadenacimiento() {
		return fechadenacimiento;
	}

	public void setFechadenacimiento(Date fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public List<Capacitaciones> getCapacitacionesList() {
		return capacitacionesList;
	}

	public void setCapacitacionesList(List<Capacitaciones> capacitacionesList) {
		this.capacitacionesList = capacitacionesList;
	}

	public List<Inscripcion> getInscripcionList() {
		return inscripcionList;
	}

	public void setInscripcionList(List<Inscripcion> inscripcionList) {
		this.inscripcionList = inscripcionList;
	}

	public AreaEmpresarial getAreaidArea() {
		return areaidArea;
	}

	public void setAreaidArea(AreaEmpresarial areaidArea) {
		this.areaidArea = areaidArea;
	}

	public Rol getIdRol() {
		return idRol;
	}

	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	}

	public Calendario getIdCalendario() {
		return idCalendario;
	}

	public void setIdCalendario(Calendario idCalendario) {
		this.idCalendario = idCalendario;
	}

	public Inventarios getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Inventarios idInventario) {
		this.idInventario = idInventario;
	}

	public List<Entregables> getEntregablesList() {
		return entregablesList;
	}

	public void setEntregablesList(List<Entregables> entregablesList) {
		this.entregablesList = entregablesList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", dni=" + dni + ", nombre=" + nombre + ", username=" + username
				+ ", fechadenacimiento=" + fechadenacimiento + ", telefono=" + telefono + ", email=" + email
				+ ", password=" + password + ", horario=" + horario + ", fechaIngreso=" + fechaIngreso + ", tipo="
				+ tipo + ", estado=" + estado + ", actividadLaboralList=" + actividadLaboralList
				+ ", capacitacionesList=" + capacitacionesList + ", inscripcionList=" + inscripcionList
				+ ", areaidArea=" + areaidArea + ", idRol=" + idRol + ", idCalendario=" + idCalendario
				+ ", idInventario=" + idInventario + ", entregablesList=" + entregablesList + ", getIdUsuario()="
				+ getIdUsuario() + ", getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getUsername()="
				+ getUsername() + ", getFechadenacimiento()=" + getFechadenacimiento() + ", getTelefono()="
				+ getTelefono() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getHorario()="
				+ getHorario() + ", getFechaIngreso()=" + getFechaIngreso() + ", getTipo()=" + getTipo()
				+ ", getEstado()=" + getEstado() + ", getActividadLaboralList()=" + getActividadLaboralList()
				+ ", getCapacitacionesList()=" + getCapacitacionesList() + ", getInscripcionList()="
				+ getInscripcionList() + ", getAreaidArea()=" + getAreaidArea() + ", getIdRol()=" + getIdRol()
				+ ", getIdCalendario()=" + getIdCalendario() + ", getIdInventario()=" + getIdInventario()
				+ ", getEntregablesList()=" + getEntregablesList() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	


}
