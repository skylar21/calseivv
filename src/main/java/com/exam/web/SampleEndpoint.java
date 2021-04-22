package com.exam.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by franc on 10/04/2021.
 */
@RestController
public class SampleEndpoint {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
