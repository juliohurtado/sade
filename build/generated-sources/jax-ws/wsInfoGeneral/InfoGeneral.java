
package wsInfoGeneral;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Este servicio provee informacion general de la ESPOCH
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InfoGeneral", targetNamespace = "http://academico.espoch.edu.ec/", wsdlLocation = "http://academico.espoch.edu.ec/OAS_Interop/InfoGeneral.wsdl")
public class InfoGeneral
    extends Service
{

    private final static URL INFOGENERAL_WSDL_LOCATION;
    private final static WebServiceException INFOGENERAL_EXCEPTION;
    private final static QName INFOGENERAL_QNAME = new QName("http://academico.espoch.edu.ec/", "InfoGeneral");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://academico.espoch.edu.ec/OAS_Interop/InfoGeneral.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INFOGENERAL_WSDL_LOCATION = url;
        INFOGENERAL_EXCEPTION = e;
    }

    public InfoGeneral() {
        super(__getWsdlLocation(), INFOGENERAL_QNAME);
    }

    public InfoGeneral(WebServiceFeature... features) {
        super(__getWsdlLocation(), INFOGENERAL_QNAME, features);
    }

    public InfoGeneral(URL wsdlLocation) {
        super(wsdlLocation, INFOGENERAL_QNAME);
    }

    public InfoGeneral(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INFOGENERAL_QNAME, features);
    }

    public InfoGeneral(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InfoGeneral(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InfoGeneralSoap
     */
    @WebEndpoint(name = "InfoGeneralSoap")
    public InfoGeneralSoap getInfoGeneralSoap() {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoGeneralSoap"), InfoGeneralSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoGeneralSoap
     */
    @WebEndpoint(name = "InfoGeneralSoap")
    public InfoGeneralSoap getInfoGeneralSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoGeneralSoap"), InfoGeneralSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INFOGENERAL_EXCEPTION!= null) {
            throw INFOGENERAL_EXCEPTION;
        }
        return INFOGENERAL_WSDL_LOCATION;
    }

}
