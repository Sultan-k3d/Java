package com.Sultan;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your rollNo:- ");
        int rollNo = input.nextInt();

        System.out.print("Please Enter your marks :- ");
        float marks = input.nextFloat();

        input.nextLine();

        System.out.print("Please Enter your name:- ");
        String name = input.nextLine();

        System.out.println("Your roll number is " + rollNo);
        System.out.println("Your marks is " + marks );
        System.out.println("You are " + name);
    }
}
