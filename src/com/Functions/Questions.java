package com.Functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean  isPrime (int n) {
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c <= Math.sqrt(n) ) {
            if(n % c == 0) {
                return false;
            }
            else {
                c++;
            }
        }
        return c * c > n;
    }
}
