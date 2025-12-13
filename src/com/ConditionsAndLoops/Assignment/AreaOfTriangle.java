package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of Tri:- ");
        int base = in.nextInt();
        System.out.print("Enter the height of Tri:- ");
        int height = in.nextInt();
        double area = 0.5 * (base * height);
        System.out.println(area);
    }
}

