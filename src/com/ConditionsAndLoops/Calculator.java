package com.ConditionsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true) {
            System.out.print("Enter the operator:- ");
            char operator = in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter two numbers:- ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(operator == '+') {
                    ans = num1 + num2;
                }
                if(operator == '-') {
                    ans = num1 - num2;
                }
                if(operator == '*') {
                    ans = num1 * num2;
                }
                if(operator == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(operator == '%') {
                    ans = num1 % num2;
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("invalid operation !!");
            }
            System.out.println(ans);
        }
    }
}
