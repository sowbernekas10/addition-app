package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.add(10, 20);

        System.out.println("Addition Result: " + result);
    }
}