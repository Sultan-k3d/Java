package com.ConditionsAndLoops.Assignment;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and height:- ");
        int base = in.nextInt();
        int height = in.nextInt();

        int area = base * height;
        System.out.println(area);
    }
}
