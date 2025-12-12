package com.Sultan;

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
        System.out.print("Enter your name:- ");
        String name = input.nextLine();
        System.out.println("Hi good morning " + name);

        //Question number 3 :-
        int principal = 20000;
        int rateOfInterest = 10;
        int time = 5;

        int simpleInterest  = (principal * rateOfInterest * time)/100 ;
        System.out.println(simpleInterest);

    }
}
