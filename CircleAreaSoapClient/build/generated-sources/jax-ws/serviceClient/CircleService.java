
package serviceClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CircleService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CircleService {


    /**
     * 
     * @param r
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "circumference", targetNamespace = "http://services/", className = "serviceClient.Circumference")
    @ResponseWrapper(localName = "circumferenceResponse", targetNamespace = "http://services/", className = "serviceClient.CircumferenceResponse")
    @Action(input = "http://services/CircleService/circumferenceRequest", output = "http://services/CircleService/circumferenceResponse")
    public double circumference(
        @WebParam(name = "r", targetNamespace = "")
        double r);

    /**
     * 
     * @param r
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "area", targetNamespace = "http://services/", className = "serviceClient.Area")
    @ResponseWrapper(localName = "areaResponse", targetNamespace = "http://services/", className = "serviceClient.AreaResponse")
    @Action(input = "http://services/CircleService/areaRequest", output = "http://services/CircleService/areaResponse")
    public double area(
        @WebParam(name = "r", targetNamespace = "")
        double r);

}
