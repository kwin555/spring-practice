package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Value;

public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String returnServiceUrl() {
        return this.url;
    }
}
