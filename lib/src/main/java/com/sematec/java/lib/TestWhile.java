package com.sematec.java.lib;

public class TestWhile {

    public static void main(String[] args) {

        int number = 10;

//        while (number < 10) {
//            System.out.println("Hello");
//            number = number + 1;
//        }


        do {
            System.out.println("Hello");
            number = number + 1;
        } while (number < 10);

    }
}
