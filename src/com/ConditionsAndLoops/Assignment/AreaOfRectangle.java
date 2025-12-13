package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length and width of a rectangle :- ");
        int length = in.nextInt();
        int width = in.nextInt();

        int area = length  * width;
        System.out.println(area);
    }
}
