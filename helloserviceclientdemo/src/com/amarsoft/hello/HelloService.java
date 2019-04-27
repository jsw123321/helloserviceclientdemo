
package com.amarsoft.hello;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloService", targetNamespace = "http://hello.amarsoft.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://hello.amarsoft.com/", className = "com.amarsoft.hello.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://hello.amarsoft.com/", className = "com.amarsoft.hello.SayHelloResponse")
    @Action(input = "http://hello.amarsoft.com/HelloService/sayHelloRequest", output = "http://hello.amarsoft.com/HelloService/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
