package modelo;

import java.util.Date;



public class Movimiento {
	

	private int codigo_moviento;
	

	private String tipo_movimiento;
	

	private String fecha_movimiento;
	
	private Double valor_movimiento;


	private String descripcion_movimiento;
	

	private Cuenta numero_cuenta;

	public int getCodigo_moviento() {
		return codigo_moviento;
	}

	public void setCodigo_moviento(int codigo_moviento) {
		this.codigo_moviento = codigo_moviento;
	}

	public String getTipo_movimiento() {
		return tipo_movimiento;
	}

	public void setTipo_movimiento(String tipo_movimiento) {
		this.tipo_movimiento = tipo_movimiento;
	}

	public String getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(String fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}

	public Double getValor_movimiento() {
		return valor_movimiento;
	}

	public void setValor_movimiento(Double valor_movimiento) {
		this.valor_movimiento = valor_movimiento;
	}

	public String getDescripcion_movimiento() {
		return descripcion_movimiento;
	}

	public void setDescripcion_movimiento(String descripcion_movimiento) {
		this.descripcion_movimiento = descripcion_movimiento;
	}

	public Cuenta getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(Cuenta numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	@Override
	public String toString() {
		return "Movimiento [codigo_moviento=" + codigo_moviento + ", tipo_movimiento=" + tipo_movimiento
				+ ", fecha_movimiento=" + fecha_movimiento + ", valor_movimiento=" + valor_movimiento
				+ ", descripcion_movimiento=" + descripcion_movimiento + ", numero_cuenta=" + numero_cuenta + "]";
	}
	
}

