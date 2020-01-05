package com.camel.app.webservice.route;

import com.camel.app.webservice.processor.DefaultOrderProcessor;
import com.camel.app.webservice.processor.UkOrderProcessor;
import com.camel.app.webservice.processor.UsaOrderProcessor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Route builder for each country
 */
public class CountryRouteBuilder extends RouteBuilder {

    private UkOrderProcessor ukOrderProcessor;
    private UsaOrderProcessor usaOrderProcessor;
    private DefaultOrderProcessor defaultOrderProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:orderUK").process(ukOrderProcessor);
        from("direct:orderUSA").process(usaOrderProcessor);
        from("direct:orderDefault").process(defaultOrderProcessor);
    }

    public void setUkOrderProcessor(UkOrderProcessor ukOrderProcessor) {
        this.ukOrderProcessor = ukOrderProcessor;
    }

    public void setUsaOrderProcessor(UsaOrderProcessor usaOrderProcessor) {
        this.usaOrderProcessor = usaOrderProcessor;
    }

    public void setDefaultOrderProcessor(DefaultOrderProcessor defaultOrderProcessor) {
        this.defaultOrderProcessor = defaultOrderProcessor;
    }
}
