package com.Functions;

public class Overloading {
    public static void main(String[] args) {
        num(2,4);
        num(23,53,43);
    }

    // Function overloading
    static void num (int a , int b) {
        System.out.println(a + " " + b);
    }
    static void num (int a, int b, int c) {
        System.out.println(a + " " + b + " " + c);
    }
}
