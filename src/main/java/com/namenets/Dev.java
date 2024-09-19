package com.namenets;
public class Dev {
    private Laptop laptop;
    private int age;

    public Dev(){
        System.out.println("Dev constructor is created.");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Parameterized constructor is called");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Working on awesome project");

    }
}
