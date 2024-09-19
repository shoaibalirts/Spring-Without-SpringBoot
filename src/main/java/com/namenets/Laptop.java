package com.namenets;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop constructor is created.");
    }
    public void compile(){
        System.out.println("Compiling in Laptop");
    }
}
