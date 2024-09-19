package com.namenets;
public class Dev {
    private Computer comp;
//    private int age;

    public Dev(){
        System.out.println("Dev constructor is created.");
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("Working on awesome project");
        comp.compile();
    }
}
