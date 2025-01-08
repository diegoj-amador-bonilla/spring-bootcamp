package org.example.service;

import org.example.serviceinterface.Computer;

public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Constructor");
    }

    public void compile(){
    System.out.println("Compiling in Desktop");
    }
}
