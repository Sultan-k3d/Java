package com.Functions.Assignments;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks out of 100:- ");
        int marks = sc.nextInt();
        grades(marks);
    }
    public static void grades(int marks) {
        if(marks > 90 && marks <= 100) {
            System.out.println("AA grade");
        }
        else if (marks > 80 && marks <= 90) {
            System.out.println("AB grade");
        }
        else if (marks > 70 && marks <= 80) {
            System.out.println("BB grade");
        }
        else if (marks > 60 && marks <= 70) {
            System.out.println("BC grade");
        }
        else if (marks > 50 && marks <= 60) {
            System.out.println("CD grade");
        } else {
            System.out.println("DD grade");
        }
    }
}
