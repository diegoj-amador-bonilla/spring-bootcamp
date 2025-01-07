package org.example.service;


public class Dev {
   private Laptop laptop;
   private int age;


    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev 1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {

        System.out.println("Working on something special");
        laptop.compile();
    }

}
