//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.04 at 04:19:28 PM CEST 
//


package icaro.infraestructura.entidadesBasicas.descEntidadesOrganizacion.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Nodo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreUso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreCompletoHost" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nodo", propOrder = {
    "nombreUso",
    "nombreCompletoHost"
})
public class Nodo {

    @XmlElement(required = true)
    protected String nombreUso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String nombreCompletoHost;

    /**
     * Gets the value of the nombreUso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUso() {
        return nombreUso;
    }

    /**
     * Sets the value of the nombreUso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUso(String value) {
        this.nombreUso = value;
    }

    /**
     * Gets the value of the nombreCompletoHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompletoHost() {
        return nombreCompletoHost;
    }

    /**
     * Sets the value of the nombreCompletoHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompletoHost(String value) {
        this.nombreCompletoHost = value;
    }

}
