package com.LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        int[] arr = {18, 12, 9, 14, 77, 50};
        System.out.println(LinearSearch(arr, num));
    }

    public static int LinearSearch (int[] arr , int target) {

        for(int element : arr) {
            if(element == target) {
                return element;
            }
        }
//        for(int index = 0; index < arr.length; index++) {
//            if(arr[index] == target ) {
//                return index;
//            }
//        }
        return -1;
    }

}
