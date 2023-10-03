package jdbc.modelo;

import java.sql.Date;

public class Reserva {
	
	private Integer id;
	private Date fecha_entrada;
	private Date fecha_salida;
	private String valor;
	private String formaPago;


	public Reserva(Date fecha_entrada, Date fecha_salida, String valor, String formaPago) {
		super();		
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.formaPago = formaPago;
	}
		
	public Reserva(Integer id, Date fecha_entrada, Date fecha_salida, String valor, String formaPago) {
		this.id = id;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.formaPago = formaPago;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getfechaE() {
		return fecha_entrada;
	}

	public Date getfechaS() {
		return fecha_salida;
	}

	public String getvalor() {
		return valor;
	}

	public String getformaPago() {
		return formaPago;
	}

	
@Override
public String toString() {
// TODO Auto-generated method stub
return String.format("La reserva generada fue: %d, %s, %s, %s, %s", this.id, this.fecha_entrada, this.fecha_salida, this.valor, this.formaPago);
	}
}

