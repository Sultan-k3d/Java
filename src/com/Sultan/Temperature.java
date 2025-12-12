package com.Sultan;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in celsius:- ");
        float temp = input.nextFloat();

        double fahrenheit = (temp  * 1.8) + 32;
        System.out.println(fahrenheit);
    }
}
