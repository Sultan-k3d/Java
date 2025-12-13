package com.Sultan;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question number 1 :-
        System.out.print("Enter a number :- ");
        int num = input.nextInt();

        if(num % 2  == 0) {
            System.out.println("it is a even number");
        } else {
            System.out.println("Its a odd number");
        }

        // Question number 2 :-
        input.nextLine();
        System.out.print("Enter your name:- ");
        String name = input.nextLine();
        System.out.println("Hi good morning " + name);

        //Question number 3 :-
        System.out.print("Enter the principal amount:- ");
        int principal = input.nextInt();
        int rateOfInterest = 10;
        int time = 5;

        int simpleInterest  = (principal * rateOfInterest * time)/100 ;
        System.out.println("Simple interest is :- " + simpleInterest);

        //Question number 4 :-
        System.out.print("Enter first number:- ");
        int num1 =  input.nextInt();
        System.out.print("Enter second number :- ");
        int num2 = input.nextInt();

        input.nextLine();

        System.out.print("Enter the operand only ('+,-,*,/') :- ");
        String operand = input.nextLine();

        switch(operand) {
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/" :
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("wrong key");
        }


       // Question number 5 :-
        System.out.print("Enter first number:- ");
        int checkGreater1 = input.nextInt();
        System.out.print("Enter second number:- ");
        int checkGreater2 = input.nextInt();

        if(checkGreater1 > checkGreater2) {
            System.out.println("first number is greater "+checkGreater1);
        } else {
            System.out.println("second number is greater "+checkGreater2);
        }

        // Question number 6 :-
        float CurrentRupeesValue = 90.38f;
        System.out.print("Enter money in INR:- ");
        float rupees = input.nextFloat();
        float USD = rupees / CurrentRupeesValue;
        System.out.println(USD);


        // Question number 7 :-
        System.out.print("Enter a number to check if its palindrome or not:- ");
        int checkPalindrome = input.nextInt();
        int reversed = 0;
        int original = checkPalindrome;
        while(checkPalindrome !=  0) {
            int lastDigit = checkPalindrome % 10;
            reversed = reversed * 10  + lastDigit;
            checkPalindrome = checkPalindrome / 10;
        }
        if(original == reversed) {
            System.out.println(" its a palindrome number " + original);
        } else  {
            System.out.println("its not a palindrome number ");
        }

    }
}
