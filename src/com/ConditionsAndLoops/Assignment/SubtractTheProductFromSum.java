package com.ConditionsAndLoops.Assignment;

public class SubtractTheProductFromSum {
    public static void main(String[] args) {
        int number = 12345;
        int product = 1;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            product = product * rem;
            sum = sum + rem;
            number /= 10;
        }
        int result = product - sum;
        System.out.println(result);

    }
}
