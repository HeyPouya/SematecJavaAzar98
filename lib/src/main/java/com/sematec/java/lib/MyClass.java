package com.sematec.java.lib;


// some descriptions
public class MyClass {



    //Variable

    /*
       int age = 30;
       String name = "Pouya";
       double d = 12.67;
       boolean isMale = false;
   */
    int height;

/////////////////////////////////

    float f = 3.16f;
    long l = 219381098;
    short s = 12312;
    byte b = 8;
    char c = 'A';


    public static void main(String[] args) {

        int result = multiply(10, 20);
        System.out.println(result);

        printHello();

        printName("Pouya");


    }

    //      /       slash
    //      \       back-slash
    //      #       sharp
    //      ,       comma
    //      .       dot
    //      :       colon
    //      ;       semi-colon
    //      '       single quotation
    //      "       double quotation
    //      {}      curly brace
    //      []      brace
    //      ()      parantez
    //      |       pipe line
    //      -       hyphen
    //      &       ampersand
    //      ~       tilda


    public static int multiplyByTwo(int firstNumber) {
        int result = firstNumber * 2;
        return result;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static double getP() {
        double pi = 3.14;
        return pi;
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
