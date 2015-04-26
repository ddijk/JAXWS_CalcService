package nl.ortecfinance.opal.jaxws_calcservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import weblogic.jws.Policy;

/**
 *
 * @author DickD
 */
@WebService(serviceName = "Calculator")

/* comment out next line (with @Policy) to get unsecured service */
@Policy(uri = "policy:usernametoken.xml")
public class Calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod
    public int add(int i, int j) {
        return i + j;
    }
}
