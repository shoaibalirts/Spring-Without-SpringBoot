package com.namenets;
public class Dev {
    private int age;

    public Dev(){
        System.out.println("Dev constructor is created.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Working on awesome project");

    }
}
