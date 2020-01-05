package com.camel.app.webservice.processor;

import com.camel.app.webservice.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Processor that processes USA orders
 */
public class UsaOrderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("ACK");
        orderResponse.setCountry("USA");
        exchange.getOut().setBody(orderResponse);
    }
}
