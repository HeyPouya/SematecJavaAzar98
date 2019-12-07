package com.sematec.java.lib;

public class TestIf {

    public static void main(String[] args) {
        int age = -1;
        String name = "Pouya";
        char character = 'f';


        if (age < 2 && age > 0) {
            System.out.println("Infant");
        }

        if (age < 10 && age > 2) {
            System.out.println("Kid");
        }

        if (age < 20 && age > 10) {
            System.out.println("Teen");
        }

        if (age < 40 && age > 20) {
            System.out.println("Young");
        }

        if (age < 90 && age > 40) {
            System.out.println("Mid-age");
        }
        if (age > 90 && age < 200) {
            System.out.println("Old");
        }


        if (age > 200 || age < 0) {
            System.out.println("Invalid age number");
        }


        if (name == "Hassan") {
            System.out.println("Has the key!");
        } else {
            System.out.println("Doesn't have the key!");
        }


        if (character == 'a') {
            System.out.println("first character");
        } else if (character == 'b') {
            System.out.println("second character");
        } else if (character == 'c') {
            System.out.println("Third character");
        } else {
            System.out.println("Unknown character");
        }


    }
}
