package com.ConditionsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = input.nextInt();
        for (int i = 0; i<= num; i++) {
            System.out.println(i);
        }
        int j = 0;
        while(j <= num) {
            System.out.println(j);
            j++;
        }
        int k =0;
        do {
            System.out.println("hello worl");
        }while(k != 0);
    }
}
