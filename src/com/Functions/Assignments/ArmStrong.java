package com.Functions.Assignments;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :- ");
//        int number = sc.nextInt();
//        System.out.println( isArmstrong(number));

        // armStrong number from 100 to 1000
        for(int i = 100; i<= 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while(n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            sum  = sum +  lastDigit * lastDigit * lastDigit;
        }
        return sum == original;
    }

}
