package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.MovimientoDAO;
import modelo.Cuenta;
import modelo.Movimiento;

@Stateless
public class GestionMovimientos {

	@Inject
	private MovimientoDAO movimientoDAO;
	
	String mensaje="";
	
	
	public boolean insertarTransferencia(String cuentaOrigen, String cuentaDestino, double monto, String descripcion) {
		Movimiento movOr = new Movimiento();
		Movimiento movDe = new Movimiento();
		
		Cuenta cuentaOr = movimientoDAO.getCuenta(cuentaOrigen);
		Cuenta cuentaDe = movimientoDAO.getCuenta(cuentaDestino);	
		
		long millis=System.currentTimeMillis();  
		java.util.Date fecha=new java.util.Date(millis);
		
		movOr.setFecha_movimiento(fecha);
		movOr.setValor_movimiento(monto);
		movOr.setDescripcion_movimiento(descripcion);
		movDe.setFecha_movimiento(fecha);
		movDe.setValor_movimiento(monto);
		movDe.setDescripcion_movimiento(descripcion);
		
		if (cuentaOr != null && cuentaDe != null) {
			if(cuentaOr.getSaldo_cuenta()>monto) {
				movimientoDAO.insertarTransferenciaOrigen(movOr, cuentaOr);
				movimientoDAO.insertarTransferenciaDestino(movDe, cuentaDe);
				movimientoDAO.realizarTransferencia(cuentaOrigen, cuentaDestino, monto);
				setMensaje("Tranferecnia Completada");
				return true;
			}else {
				
				setMensaje("Sin Saldo");
				
				return false;
			}
		}else {
			
			setMensaje("Cuenta No Encontrada");
			return false;
		}		
	}
	
	public List<Movimiento> getMovimientos(String numeroCuenta){
		return movimientoDAO.getMovimientosCuenta(numeroCuenta);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
