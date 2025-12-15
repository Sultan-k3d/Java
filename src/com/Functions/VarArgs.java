package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(23,534,2,4,3232,423,42,44,3,45,66,67,8);
        multiple(23,53, "Sultan", "Ateek", "Aftab", "Owais");
    }
    static void multiple(int a , int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static  void fun(int ...a) {
        System.out.println(Arrays.toString(a));
    }
}
