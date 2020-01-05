package com.camel.app.webservice.customer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class CustomerOrderRouteBuilder extends RouteBuilder {

    private String customerOrderRestEndpoint;

    public void setCustomerOrderRestEndpoint(String customerOrderRestEndpoint) {
        this.customerOrderRestEndpoint = customerOrderRestEndpoint;
    }

    @Override
    public void configure() throws Exception {
        from(customerOrderRestEndpoint).recipientList(simple("direct:${header.operationName}"));

        from("direct:placeOrder").process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                OrderStatus orderStatus = new OrderStatus();
                orderStatus.setStatus("ACK");
                orderStatus.setCountry("UK");
                exchange.getOut().setBody(orderStatus);
            }
        }).end();
    }
}
