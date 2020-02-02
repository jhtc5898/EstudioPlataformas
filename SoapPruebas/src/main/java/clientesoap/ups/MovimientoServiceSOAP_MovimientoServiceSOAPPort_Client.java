
package clientesoap.ups;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2020-01-20T12:36:17.826-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class MovimientoServiceSOAP_MovimientoServiceSOAPPort_Client {

    private static final QName SERVICE_NAME = new QName("http://servicios/", "MovimientoServiceSOAPService");

    private MovimientoServiceSOAP_MovimientoServiceSOAPPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MovimientoServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        MovimientoServiceSOAPService ss = new MovimientoServiceSOAPService(wsdlURL, SERVICE_NAME);
        MovimientoServiceSOAP port = ss.getMovimientoServiceSOAPPort();  
        
        {
        System.out.println("RealizarTransferencia...");
        java.lang.String cuentaOrigen = "11";
        java.lang.String cuentaDestino = "12";
        double Tranferencia = 99;
        java.lang.String Descripcion = "Tranferencia Dinero";
        clientesoap.ups.Respuesta _realizarTransferencia__return = port.realizarTransferencia(cuentaOrigen, cuentaDestino, Tranferencia, Descripcion);
        System.out.println("Envio Realizado=" + _realizarTransferencia__return);


        }

        System.exit(0);
    }

}