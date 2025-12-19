package com.ArraysAndArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of primitive
//        int[] arr = new int [5];
//        for(int i =0 ; i < arr.length; i++ ) {
//            arr[i] = sc.nextInt();

//        System.out.println(Arrays.toString(arr));
//        for(int num: arr) {
//            System.out.print(num + " ");
//        }
//        for(int i =0; i< arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        str [0]= "HAJRa";

        System.out.println(Arrays.toString(str));

//        for(String elm : str) {
//            System.out.print(elm+ " ");
//        }
    }
}
