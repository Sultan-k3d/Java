package com.ConditionsAndLoops;

import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Its in lower case");
        }else {
            System.out.println("The char is in upper case");
        }

        System.out.println(ch);
    }
}
