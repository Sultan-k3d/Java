package com.ConditionsAndLoops;

public class CountOccurrence {
    public static void main(String[] args) {
        int number = 1383339;
        int temp = number;
        int count = 0;

        while (number > 0) {
            int rem = number % 10;
            number = number/ 10;
            if(rem ==  3) {
                count++;
            }
        }

        System.out.println(count);
    }
}
