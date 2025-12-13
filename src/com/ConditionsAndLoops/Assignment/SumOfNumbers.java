package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter a number:- ");
            int num = sc.nextInt();
            sum += num;
            if(num == 0) {
                break;
            }
        }
        System.out.println("Sum of all digits entered by user : " + sum);
    }
}
