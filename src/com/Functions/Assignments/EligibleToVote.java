package com.Functions.Assignments;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();
        System.out.println(eligible(age));
    }
    public static boolean eligible(int age) {
        int eligible = 18;
        return age >= eligible;
    }
}
