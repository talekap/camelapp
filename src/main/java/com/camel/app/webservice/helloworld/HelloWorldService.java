package com.camel.app.webservice.helloworld;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

@Path("/helloservice/")
public class HelloWorldService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldService.class);
    private MessageContext jaxrsContext;

    @GET
    @Path("/hello/{hellostring}/")
    @Produces("text/plain")
    public String getHellostring(@PathParam("hellostring") String hellostring) {
        return "Hello " + hellostring;
    }

    @Context
    public void setMessageContext(MessageContext messageContext) {
        this.jaxrsContext = messageContext;
    }

}
