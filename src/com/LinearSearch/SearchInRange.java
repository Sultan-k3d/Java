package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 17, 3, 14, 28, 87};
//        SearchRange(arr);
        System.out.println(LinearSearch(arr, 3, 1, 4));

    }
    public static void SearchRange(int[] arr) {
        for(int i = 1; i<arr.length-2; i++) {
            System.out.println(arr[i]);
        }
    }


    public static int LinearSearch (int[] arr , int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index = start; index <= end; index++) {
            if(arr[index] == target ) {
                return index;
            }
        }
        return -1;
    }

}
