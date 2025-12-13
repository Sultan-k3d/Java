package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a side of equl tri:- ");
        int side = in.nextInt();
        double area = (Math.sqrt(3) / 4) * (side * side);
        System.out.println(area);
    }
}
