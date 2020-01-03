package com.camel.app.webservice.helloworld;

/**
 * Response POJO
 */
public class HelloResponse {
    private String name;
    private String greetings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
