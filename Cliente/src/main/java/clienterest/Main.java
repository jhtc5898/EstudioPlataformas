package clienterest;

import java.util.List;
import modelo.Movimiento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enviar numero de cuenta 
		MovimientoCli cliente = new MovimientoCli();
		List<Movimiento> movimientos = cliente.getMovimientos("12");
		System.out.println(movimientos);

	}

}
