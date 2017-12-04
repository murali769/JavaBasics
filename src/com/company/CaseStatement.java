package com.company;

import java.util.Scanner;

public class CaseStatement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Word:");
        String x=sc.next();

        switch(x){
            case "Hello":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Middle Default");
            case "Bye":
                System.out.println("Welcome");
            break;

        }

    }
}
