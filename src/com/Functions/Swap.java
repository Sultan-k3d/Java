package com.Functions;

import java.util.Scanner;

public class Swap {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a,b);
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//    public static void swap (int a , int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a is " + a);
//        System.out.println("b is "+ b);
//
//    }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a number:- ");
         int num = sc.nextInt();

         fibonacci(num);

         System.out.print("Enter a number:- ");
         int num2 = sc.nextInt();

         if(num2 < 0) {
             System.out.println("Enter a positive number");
         } else {
             int result = factorial(num2);
             System.out.println("Factorial of " + num + result);
         }

//         int firstNum = 0;
//         int secondNum = 1;



//         while(firstNum <= num) {
//             int next = firstNum + secondNum;
//             firstNum = secondNum;
//             secondNum = next;
//             System.out.println(secondNum);
//         }
     }
     public static void fibonacci (int num) {
         int firstNum = 0;
         int secondNum = 1;
         if(num < 0) {
             System.out.println("Enter a pos number");
             return;
         }
         while(firstNum <= num) {
             int next = firstNum + secondNum;
             firstNum = secondNum;
             secondNum = next;
             System.out.println(secondNum);
         }
     }

     public static int factorial (int n) {
         if (n <= 1) {
             return 1;
         } else {
             return n * factorial( n - 1);
         }
     }
}
