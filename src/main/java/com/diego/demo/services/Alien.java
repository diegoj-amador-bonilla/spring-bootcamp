package com.diego.demo.services;

import com.diego.demo.serviceinterface.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired //field injection
    @Qualifier("laptop")
    private Computer comp;

    //constructor injection
//    public Alien(Laptop laptop){
//        this.laptop = laptop;
//    }
//    //setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build() {

        comp.compile();

        System.out.println("Working on something");
    }

}
