package com.ConditionsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = in.nextInt();
        System.out.print("Enter second number:- ");
        int b = in.nextInt();
        System.out.print("Enter third number:- ");
        int c = in.nextInt();

        if(a > b && a > c) {
            System.out.println("A is largest" + a);
        }
        else if (b > c) {
            System.out.println("B is largest" + b);
        } else {
            System.out.println("C is largest " + c);
        }
    }
}
