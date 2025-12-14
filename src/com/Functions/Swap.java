package com.Functions;

public class Swap {
    public static void main(String[] args) {
        swap(2,3);
    }
    public static void swap (int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a);
        System.out.println("b is "+ b);

    }
}
