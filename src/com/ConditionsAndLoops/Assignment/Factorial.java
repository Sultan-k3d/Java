package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();
        int prod = 1;
        for(int i = 1; i<=number; i++) {
            prod *= i;
        }
        System.out.println("Factorial of number is : " + prod);
    }

}
