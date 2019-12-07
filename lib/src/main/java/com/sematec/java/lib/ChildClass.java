package com.sematec.java.lib;

public class ChildClass extends ParentClass {


    public void someMethod() {
        printP();
        printName("Qoli");
        printHello();
    }

    @Override
    public void printName(String name) {
        super.printName(name);
        System.out.println("Welcome to my application!");
    }

    @Override
    public void printHello() {
        System.out.println("GoodBye!");
    }
}
