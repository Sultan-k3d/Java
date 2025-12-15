package com.Functions.Assignments;

import java.util.Scanner;

public class MaxAndMinInThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximum(a, b, c);
        minimum(a, b, c);
    }

    public static void maximum (int a , int b, int c ) {
        if(a > b && a > c) {
            System.out.println("A is greater " + a);
        } else if (b > c) {
            System.out.println("B is greater " + b);
        } else {
            System.out.println("C is greater " + c);
        }
    }
    public static void minimum (int a, int b, int c) {
        if(a < b && a < c) {
            System.out.println("A is smallest " + a);
        } else if (b < c) {
            System.out.println("B is smallest " + b);
        } else{
            System.out.println("C is smallest " + c);
        }
    }
}
