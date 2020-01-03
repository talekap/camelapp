package com.camel.app.webservice.helloworld;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Rest service route builder for Hello world service
 */
public class RestServiceRouteBuilder extends RouteBuilder {

    private String restEndpoint;

    @Override
    public void configure() throws Exception {
        from(restEndpoint).recipientList(simple("direct:${header.operationName}"));

        from("direct:getHelloString")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        HelloResponse helloResponse = new HelloResponse();
                        helloResponse.setName(exchange.getIn().getHeader("hellostring", String.class));
                        helloResponse.setGreetings("From camel router PoC says Hello!");
                        exchange.getOut().setBody(helloResponse);
                    }
                }).end();
    }

    public void setRestEndpoint(String restEndpoint) {
        this.restEndpoint = restEndpoint;
    }
}
