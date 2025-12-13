package com.ConditionsAndLoops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++) {
            int next = a  + b;
            a = b;
            b = next;
        }
        System.out.println(b);
    }
}
