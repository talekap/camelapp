package com.camel.app.webservice.route;

import com.camel.app.webservice.customer.OrderRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import static java.util.Optional.ofNullable;

/**
 * Route builder to set country
 */
public class CountryFilterRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:filterCountry").process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                OrderRequest request = exchange.getIn().getBody(OrderRequest.class);
                if (ofNullable(request).isPresent()) {
                    exchange.getIn().getHeaders().put("country", request.getCountry());
                }
            }
        });
    }
}
