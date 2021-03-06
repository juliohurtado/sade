
package wsInfoSeguridad;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SeguridadSoap", targetNamespace = "http://academico.espoch.edu.ec/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SeguridadSoap {


    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns wsInfoSeguridad.ArrayOfRolCarrera
     */
    @WebMethod(operationName = "AutenticarUsuarioCarrera", action = "http://academico.espoch.edu.ec/AutenticarUsuarioCarrera")
    @WebResult(name = "AutenticarUsuarioCarreraResult", targetNamespace = "http://academico.espoch.edu.ec/")
    @RequestWrapper(localName = "AutenticarUsuarioCarrera", targetNamespace = "http://academico.espoch.edu.ec/", className = "wsInfoSeguridad.AutenticarUsuarioCarrera")
    @ResponseWrapper(localName = "AutenticarUsuarioCarreraResponse", targetNamespace = "http://academico.espoch.edu.ec/", className = "wsInfoSeguridad.AutenticarUsuarioCarreraResponse")
    public ArrayOfRolCarrera autenticarUsuarioCarrera(
        @WebParam(name = "login", targetNamespace = "http://academico.espoch.edu.ec/")
        String login,
        @WebParam(name = "password", targetNamespace = "http://academico.espoch.edu.ec/")
        String password);

    /**
     * 
     * @param login
     * @return
     *     returns wsInfoSeguridad.ArrayOfRolCarrera
     */
    @WebMethod(operationName = "GetRolUsuarioCarrera", action = "http://academico.espoch.edu.ec/GetRolUsuarioCarrera")
    @WebResult(name = "GetRolUsuarioCarreraResult", targetNamespace = "http://academico.espoch.edu.ec/")
    @RequestWrapper(localName = "GetRolUsuarioCarrera", targetNamespace = "http://academico.espoch.edu.ec/", className = "wsInfoSeguridad.GetRolUsuarioCarrera")
    @ResponseWrapper(localName = "GetRolUsuarioCarreraResponse", targetNamespace = "http://academico.espoch.edu.ec/", className = "wsInfoSeguridad.GetRolUsuarioCarreraResponse")
    public ArrayOfRolCarrera getRolUsuarioCarrera(
        @WebParam(name = "login", targetNamespace = "http://academico.espoch.edu.ec/")
        String login);

    /**
     * 
     * @param login
     * @param password
     * @return
     *     returns wsInfoSeguridad.Persona
     */
    @WebMethod(operationName = "GetUsuarioFacultad", action = "http://academico.espoch.edu.ec/GetUsuarioFacultad")
    @WebResult(name = "GetUsuarioFacultadResult", targetNamespace = "http://academico.espoch.edu.ec/")
    @RequestWrapper(localName = "GetUsuarioFacultad", targetNamespace = "http://academico.espoch.edu.ec/", className = "wsInfoSeguridad.GetUsuarioFacultad")
    @ResponseWrapper(localName = "GetUsuarioFacultadResponse", targetNamespace = "http://academico.espoch.edu.ec/", className = "wsInfoSeguridad.GetUsuarioFacultadResponse")
    public Persona getUsuarioFacultad(
        @WebParam(name = "login", targetNamespace = "http://academico.espoch.edu.ec/")
        String login,
        @WebParam(name = "password", targetNamespace = "http://academico.espoch.edu.ec/")
        String password);

}
