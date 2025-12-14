package com.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit:- ");
        String fruit = sc.nextLine();

        // Enhanced switch
        switch (fruit){
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "grapes" -> System.out.println("small fruit");
            case "orange" -> System.out.println("round fruit");
            default -> System.out.println("enter a valid fruit");}

        System.out.print("Enter the day :- ");
        int day = sc.nextInt();
        switch (day) {
            case  1 -> System.out.println("Sunday");
            case  2 -> System.out.println("Monday");
            case  3 -> System.out.println("Tuesday");
            case  4 -> System.out.println("Wednesday");
            case  5 -> System.out.println("Thursday");
            case  6 -> System.out.println("Friday");
            case  7 -> System.out.println("Saturday");
            default -> System.out.println("Enter a valid day number");


        }

//        if(fruit.equals("Mango")) {
//            System.out.println("King of fruits");
//        } else if (fruit.equals("Apple")) {
//            System.out.println("A sweet red fruit");
//        } else {
//            System.out.println("Wrong fruit we only check mango and apple");
//        }
    }
}
