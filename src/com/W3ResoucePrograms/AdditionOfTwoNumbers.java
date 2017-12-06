package com.W3ResoucePrograms;

import java.util.Scanner;

public class AdditionOfTwoNumbers {


    public static int addition(int a,int b){

        return a+b;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number to add");
        int i=sc.nextInt();
        System.out.println("Enter the second number to add");
        int x=sc.nextInt();

        System.out.println("The sum of two numbers is " +AdditionOfTwoNumbers.addition(i,x));

    }
}
