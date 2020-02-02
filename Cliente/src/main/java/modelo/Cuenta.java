package modelo;

import java.util.Date;



public class Cuenta {


	private int numero_cuenta;
	

	private String cedula_cuenta;
	

	private String nombres_persona_cuenta;
	

	private String apellidos_persona_cuenta;
	

	private double saldo_cuenta;


	private String fecha_apertura_cuenta;

	public int getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(int numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getCedula_cuenta() {
		return cedula_cuenta;
	}

	public void setCedula_cuenta(String cedula_cuenta) {
		this.cedula_cuenta = cedula_cuenta;
	}

	public String getNombres_persona_cuenta() {
		return nombres_persona_cuenta;
	}

	public void setNombres_persona_cuenta(String nombres_persona_cuenta) {
		this.nombres_persona_cuenta = nombres_persona_cuenta;
	}

	public String getApellidos_persona_cuenta() {
		return apellidos_persona_cuenta;
	}

	public void setApellidos_persona_cuenta(String apellidos_persona_cuenta) {
		this.apellidos_persona_cuenta = apellidos_persona_cuenta;
	}

	public double getSaldo_cuenta() {
		return saldo_cuenta;
	}

	public void setSaldo_cuenta(double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}

	public String getFecha_apertura_cuenta() {
		return fecha_apertura_cuenta;
	}

	public void setFecha_apertura_cuenta(String fecha_apertura_cuenta) {
		this.fecha_apertura_cuenta = fecha_apertura_cuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numero_cuenta=" + numero_cuenta + ", cedula_cuenta=" + cedula_cuenta
				+ ", nombres_persona_cuenta=" + nombres_persona_cuenta + ", apellidos_persona_cuenta="
				+ apellidos_persona_cuenta + ", saldo_cuenta=" + saldo_cuenta + ", fecha_apertura_cuenta="
				+ fecha_apertura_cuenta + "]";
	}
	
}
