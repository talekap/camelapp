package com.camel.app.webservice.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for {@link HelloWorldService}
 */
public class HelloWorldServiceTest {

    @Test
    public void givenHelloWorldServiceVerifyResponseIsNull(){
        HelloWorldService service = new HelloWorldService();
        String response = service.getHelloString("test");

        assertNull(response);
    }
}