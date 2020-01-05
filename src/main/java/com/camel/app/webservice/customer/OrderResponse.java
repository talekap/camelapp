package com.camel.app.webservice.customer;

/**
 * Response POJO class
 */
public class OrderResponse {
    private String status;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
