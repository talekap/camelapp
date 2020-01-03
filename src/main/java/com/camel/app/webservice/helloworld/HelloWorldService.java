package com.camel.app.webservice.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Hello world service
 */
@Path("/helloservice/")
public class HelloWorldService {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

    @GET
    @Path("/hello/{hellostring}/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloString(@PathParam("hellostring") String hellostring) {
        logger.debug("Request received at service HelloWorldService");
        return null;
    }
}
