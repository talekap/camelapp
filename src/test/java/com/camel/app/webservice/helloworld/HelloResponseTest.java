package com.camel.app.webservice.helloworld;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test class for {@link HelloResponse}
 */
public class HelloResponseTest {

    @Test
    public void testHappyPath() {
        HelloResponse helloResponse = buildHelloResponse();

        assertThat("hello", is(helloResponse.getGreetings()));
        assertThat("test", is(helloResponse.getName()));
    }

    private HelloResponse buildHelloResponse() {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setGreetings("hello");
        helloResponse.setName("test");
        return helloResponse;
    }

}