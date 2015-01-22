
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEstudiante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estudiante" type="{http://academico.espoch.edu.ec/}Estudiante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEstudiante", propOrder = {
    "estudiante"
})
public class ArrayOfEstudiante {

    @XmlElement(name = "Estudiante", nillable = true)
    protected List<Estudiante> estudiante;

    /**
     * Gets the value of the estudiante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estudiante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstudiante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Estudiante }
     * 
     * 
     */
    public List<Estudiante> getEstudiante() {
        if (estudiante == null) {
            estudiante = new ArrayList<Estudiante>();
        }
        return this.estudiante;
    }

}
