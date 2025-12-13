package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:- ");
        int radius = in.nextInt();
        float pi = 3.14f;
        double area = Math.PI * (radius * radius);
        System.out.println("Area of a circle: "+area);
    }
}
