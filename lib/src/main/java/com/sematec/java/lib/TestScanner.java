package com.sematec.java.lib;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name :");

        String name = scanner.nextLine();

        System.out.println("Welcome " + name);

        System.out.print("Please enter your birthYear :");

        int birthYear = scanner.nextInt();

        int age = 2019 - birthYear;

        System.out.println("Your age is : " + age);


    }
}
