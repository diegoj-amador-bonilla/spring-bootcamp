package io.javabrains.springbootquickstart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Starter setup for Spring Boot Application from a Maven application

@SpringBootApplication
public class CourseAPIApp {

    public static void main (String[] args){
        SpringApplication.run(CourseAPIApp.class,args);
    }
}
