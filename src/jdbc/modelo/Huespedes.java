package jdbc.modelo;

import java.sql.Date;

public class Huespedes {
	private Integer Id;
	private String Nombre;
	private String Apellido;
	private Date Fecha_nacimiento;
	private String Nacionalidad;
	private String Telefono;
	private Integer IdReserva;
	
	public Huespedes(String nombre, String apellido,  Date fechaNacimiento, String nacionalidad, String telefono,
			Integer idReserva) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Fecha_nacimiento = fechaNacimiento;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		IdReserva = idReserva;
	}
	
	public Huespedes(Integer id, String nombre, String apellido, Date fecha_nacimiento, String nacionalidad,
			String telefono, Integer idReserva) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		Fecha_nacimiento = fecha_nacimiento;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		IdReserva = idReserva;
	}


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public Date getFecha_nacimiento() {
		return Fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		Fecha_nacimiento = fecha_nacimiento;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Integer getIdReserva() {
		return IdReserva;
	}

	public void setIdReserva(Integer idReserva) {
		IdReserva = idReserva;
	}
	
}
