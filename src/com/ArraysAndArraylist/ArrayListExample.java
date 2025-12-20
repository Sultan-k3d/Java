package com.ArraysAndArraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> nums = new ArrayList<>(10);
//        nums.add(234);
//        nums.add(232);
//        nums.add(23);
//        nums.add(24);
//        nums.add(34);
//        System.out.println(nums);
//        nums.set(0, 100);
//        System.out.println(nums);
//        nums.remove(1);
//        System.out.println(nums);
        System.out.print("Enter numbers:- ");
        for(int i =0; i< 5; i++) {
            nums.add(sc.nextInt());
        }
//        System.out.println(nums);
        for(int i =0; i<5; i++) {
            System.out.println(nums.get(i));
        }

    }
}
