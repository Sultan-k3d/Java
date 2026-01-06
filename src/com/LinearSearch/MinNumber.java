package com.LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {2,55,59,76,29};
        int max = 789;
        System.out.println(findMinNum(arr,max));
    }
    static int findMinNum(int[] arr, int max) {
        if(arr.length == 0) {
            return -1;
        }
        for(int elem : arr) {
            if(elem < max) {
                max = elem;
            }
        }
        return max;
    }
}
