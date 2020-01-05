package com.camel.app.webservice.processor;

import com.camel.app.webservice.customer.OrderResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Processor that processes orders other than UK, USA
 */
public class DefaultOrderProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setStatus("ACK");
        orderResponse.setCountry("Not Applicable");
        exchange.getOut().setBody(orderResponse);
    }
}
