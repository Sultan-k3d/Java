package com.Functions.Assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if its odd or even:- ");
        int num = sc.nextInt();
        evenOdd(num);
    }
    public static void evenOdd(int n) {
        if(n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
