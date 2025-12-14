package com.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        System.out.println(sumOfThree());
    }

    public static void sum() {
        int num1 = 34;
        int num2 = 32;
        System.out.println(num1 + num2);
    }
    // Return the value

    public static int sumOfThree () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        return a + b + c;
    }
}
