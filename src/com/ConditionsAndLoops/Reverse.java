package com.ConditionsAndLoops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:- ");

        int number = in.nextInt();

        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(reverse);

    }
}
