package com.sematec.java.lib;

public class TestObjectClass {

    public static void main(String[] args) {
        //object || instance

        String s = "";
        CalculatorClass c = new CalculatorClass();

        double first = 10;
        double second = 20;

        double add = c.add(first, second);
        double mul = c.mul(first, second);
        double div = c.div(first, second);

    }
}
