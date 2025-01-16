package io.javabrains.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Value("${my.greeting: default value of HELLO}")
    private String greetingMessage;

    @Value("${my.listValues}")
    private List<String> listValues;

    @Value("#{${dbValues}}")
    private Map<String, String> dbValues;


    @RequestMapping("/hello")
    public String sayHi(){
        return greetingMessage;
    }

}
