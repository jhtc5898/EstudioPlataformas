package clienterest;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import modelo.Movimiento;
public class MovimientoCli 
{
private String WS_GET_MOVIMIENTOS = "http://localhost:8080/practicaWS/rs/movimientos";

public List<Movimiento> getMovimientos(String numeroCuenta) 
{
	Client cliente = ClientBuilder.newClient();
	WebTarget target = cliente.target(WS_GET_MOVIMIENTOS).queryParam("cuenta",numeroCuenta);
	List<Movimiento> tipoTransacciones = target.request().get(new GenericType<List<Movimiento>>() {});
	cliente.close();
	return tipoTransacciones;
}
}
