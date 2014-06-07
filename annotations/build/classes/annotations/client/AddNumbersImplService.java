
package annotations.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddNumbersImplService", targetNamespace = "http://server.annotations/", wsdlLocation = "http://localhost:8080/jaxws-annotations/addnumbers?wsdl")
public class AddNumbersImplService
    extends Service
{

    private final static URL ADDNUMBERSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADDNUMBERSIMPLSERVICE_EXCEPTION;
    private final static QName ADDNUMBERSIMPLSERVICE_QNAME = new QName("http://server.annotations/", "AddNumbersImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/jaxws-annotations/addnumbers?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDNUMBERSIMPLSERVICE_WSDL_LOCATION = url;
        ADDNUMBERSIMPLSERVICE_EXCEPTION = e;
    }

    public AddNumbersImplService() {
        super(__getWsdlLocation(), ADDNUMBERSIMPLSERVICE_QNAME);
    }

    public AddNumbersImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDNUMBERSIMPLSERVICE_QNAME, features);
    }

    public AddNumbersImplService(URL wsdlLocation) {
        super(wsdlLocation, ADDNUMBERSIMPLSERVICE_QNAME);
    }

    public AddNumbersImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDNUMBERSIMPLSERVICE_QNAME, features);
    }

    public AddNumbersImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddNumbersImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddNumbers
     */
    @WebEndpoint(name = "AddNumbersImplPort")
    public AddNumbers getAddNumbersImplPort() {
        return super.getPort(new QName("http://server.annotations/", "AddNumbersImplPort"), AddNumbers.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddNumbers
     */
    @WebEndpoint(name = "AddNumbersImplPort")
    public AddNumbers getAddNumbersImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.annotations/", "AddNumbersImplPort"), AddNumbers.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDNUMBERSIMPLSERVICE_EXCEPTION!= null) {
            throw ADDNUMBERSIMPLSERVICE_EXCEPTION;
        }
        return ADDNUMBERSIMPLSERVICE_WSDL_LOCATION;
    }

}