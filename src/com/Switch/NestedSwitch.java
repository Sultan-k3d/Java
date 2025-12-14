package com.Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employ id:- ");
        int empId = sc.nextInt();
        System.out.print("Enter department:- ");
        String department = sc.next();

        // older version
//        switch(empId) {
//            case 1 :
//                System.out.println("Sultan");
//                switch (department) {
//                    case "IT" :
//                        System.out.println("IT department");
//                        break;
//                    case "Management" :
//                        System.out.println("management department");
//                        break;
//                    default:
//                        System.out.println("Enter a department");
//                }
//                break;
//            case 2 :
//                System.out.println("Shubham");
//                switch (department) {
//                    case "IT" :
//                        System.out.println("IT department");
//                        break;
//                    case "Management" :
//                        System.out.println("management department");
//                        break;
//                    default:
//                        System.out.println("Enter a department");
//                }
//            case 3:
//                System.out.println("Mayank");
//                switch (department) {
//                    case "IT" :
//                        System.out.println("IT department");
//                        break;
//                    case "Management" :
//                        System.out.println("management department");
//                        break;
//                    default:
//                        System.out.println("Enter a department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpId");
//        }

        // Enhanced version of switch statements
        switch (empId) {
            case 1 -> {
                System.out.println("Sultan");
                switch (department) {
                    case "IT" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Enter a valid department");
                }
            }
            case 2 -> {
                System.out.println("Shubham");
                switch (department) {
                    case "IT" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Enter a valid department");
                }
            }
            case 3 -> {
                System.out.println("Mayank");
                switch (department) {
                    case "IT" -> System.out.println("IT");
                    case "Management" -> {
                        System.out.println("Management department");
                        System.out.println("HR");
                    }
                    default -> System.out.println("Enter a valid department");
                }
            }
            default -> System.out.println();
        }
    }
}
