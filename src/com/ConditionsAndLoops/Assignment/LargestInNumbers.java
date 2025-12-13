package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class LargestInNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while(true) {
            System.out.print("Enter a number:- ");
            int num = sc.nextInt();
            if(num > max) {
                max = num;
            }
            if(num == 0) {
                break;
            }
        }
        System.out.println("Largest number entered by user : " + max);
    }
}
