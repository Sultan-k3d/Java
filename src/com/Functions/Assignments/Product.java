package com.Functions.Assignments;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a,b));
    }
    public static int product(int a, int b) {
        return a * b;
    }
}
