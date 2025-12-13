package com.ConditionsAndLoops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if its pos or neg or a zero:- ");
        int num = input.nextInt();
        if(num > 0) {
            System.out.println("its a positive number");
        }
        else if (num < 0) {
            System.out.println("its a negative number");
        }
        else {
            System.out.println("Its a zero");
        }
    }

}
