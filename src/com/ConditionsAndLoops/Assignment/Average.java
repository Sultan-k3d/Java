package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            System.out.print("Enter a number :- ");
            int num = sc.nextInt();
            if(num == 0) {
                break;
            } else {
                count++;
            }
            sum += num;

        }
        System.out.println("Average of n numbers is :" + (sum/count));
    }
}
