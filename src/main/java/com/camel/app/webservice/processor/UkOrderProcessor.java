package com.camel.app.webservice.processor;

import com.camel.app.webservice.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Processor that processes UK orders
 */
public class UkOrderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("ACK");
        orderResponse.setCountry("UK");
        exchange.getOut().setBody(orderResponse);
    }
}
