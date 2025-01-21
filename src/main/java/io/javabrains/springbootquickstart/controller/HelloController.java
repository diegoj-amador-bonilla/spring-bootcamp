package io.javabrains.springbootquickstart.controller;

import io.javabrains.springbootquickstart.DbSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class HelloController {
    @Autowired
    private DbSettings dbSettings;

//    @Value("${my.greeting: default value of HELLO}")
//    private String greetingMessage;
//
//    @Value("${my.listValues:default value}")
//    private List<String> listValues;
//
//    @Value("#{${dbValues:default value}}")
//    private Map<String, String> dbValues;


    @RequestMapping("/hello")
    public String sayHi(){
        return dbSettings.getConnection() + dbSettings.getPort() + dbSettings.getHost();
    }

}
