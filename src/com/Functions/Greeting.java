package com.Functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String name = sc.nextLine();
        String greeting = greet(name);
        System.out.println(greeting);
    }
    static String greet (String name) {
        return "Hello " + name;
    }
}
