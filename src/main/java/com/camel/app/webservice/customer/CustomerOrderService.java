package com.camel.app.webservice.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Customer order service
 */
@Path("/customer")
public class CustomerOrderService {
    private static final Logger logger = LoggerFactory.getLogger(CustomerOrderService.class);

    @POST
    @Path("/placeorder")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public OrderStatus placeOrder(Order order) {
        logger.debug("- CustomerOrderService -");
        return null;
    }
}
