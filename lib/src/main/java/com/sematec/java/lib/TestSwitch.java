package com.sematec.java.lib;

public class TestSwitch {

    public static void main(String[] args) {
        int age = 20;

        switch (age) {
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
            case 3:
                System.out.println("Number 3");
                break;
            case 4:
                System.out.println("Number 4");
                break;
            case 5:
                System.out.println("Number 5");
                break;
            default:
                System.out.println("Invalid age !");
        }
    }
}
