
package clientesoap.ups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para cuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidos_persona_cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedula_cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_apertura_cuenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nombres_persona_cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero_cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="saldo_cuenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuenta", propOrder = {
    "apellidosPersonaCuenta",
    "cedulaCuenta",
    "fechaAperturaCuenta",
    "nombresPersonaCuenta",
    "numeroCuenta",
    "saldoCuenta"
})
public class Cuenta {

    @XmlElement(name = "apellidos_persona_cuenta")
    protected String apellidosPersonaCuenta;
    @XmlElement(name = "cedula_cuenta")
    protected String cedulaCuenta;
    @XmlElement(name = "fecha_apertura_cuenta")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAperturaCuenta;
    @XmlElement(name = "nombres_persona_cuenta")
    protected String nombresPersonaCuenta;
    @XmlElement(name = "numero_cuenta")
    protected int numeroCuenta;
    @XmlElement(name = "saldo_cuenta")
    protected double saldoCuenta;

    /**
     * Obtiene el valor de la propiedad apellidosPersonaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidosPersonaCuenta() {
        return apellidosPersonaCuenta;
    }

    /**
     * Define el valor de la propiedad apellidosPersonaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidosPersonaCuenta(String value) {
        this.apellidosPersonaCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCuenta() {
        return cedulaCuenta;
    }

    /**
     * Define el valor de la propiedad cedulaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCuenta(String value) {
        this.cedulaCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAperturaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAperturaCuenta() {
        return fechaAperturaCuenta;
    }

    /**
     * Define el valor de la propiedad fechaAperturaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAperturaCuenta(XMLGregorianCalendar value) {
        this.fechaAperturaCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresPersonaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombresPersonaCuenta() {
        return nombresPersonaCuenta;
    }

    /**
     * Define el valor de la propiedad nombresPersonaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombresPersonaCuenta(String value) {
        this.nombresPersonaCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     */
    public void setNumeroCuenta(int value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoCuenta.
     * 
     */
    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    /**
     * Define el valor de la propiedad saldoCuenta.
     * 
     */
    public void setSaldoCuenta(double value) {
        this.saldoCuenta = value;
    }

}
