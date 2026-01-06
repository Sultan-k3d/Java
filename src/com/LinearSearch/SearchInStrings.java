package com.LinearSearch;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {

        char target = 'u';
        System.out.println(SearchName("Sultan", target));


    }
    public static boolean SearchName (String name, char target) {
        if(name.isEmpty()) {
            return false;
        }

//        for(int index = 0; index < name.length(); index++) {
//            if(target == name.charAt(index)) {
//                return true;
//            }
//        }
        for(char  ch :  name.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
}
