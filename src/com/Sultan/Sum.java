package com.Sultan;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:- ");
        int num1 = input.nextInt();

        System.out.print("Enter second number:- ");
        int num2 = input.nextInt();

        System.out.println(num1 + num2);

    }
}
