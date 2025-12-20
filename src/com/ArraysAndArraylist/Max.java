package com.ArraysAndArraylist;

public class Max {
    public static void main(String[] args) {
        int[] arr  = { 1 , 3 , 23 , 9 , 18};
        System.out.println(max(arr));

    }
    static int max (int[] arr) {
        int maximum = 0;
        for (int j : arr) {
            if (j > maximum) {
                maximum = j;
            }
        }
        return maximum;

    }
}
