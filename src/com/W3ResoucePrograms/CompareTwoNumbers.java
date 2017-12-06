package com.W3ResoucePrograms;

import java.util.Scanner;

public class CompareTwoNumbers {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int i=sc.nextInt();
        System.out.println("Please Enter the second number to compare");
        int x=sc.nextInt();
        if(i>x){

            System.out.println("The first number is greater than the second number " +i);
        }else{
            System.out.println("The second number is greater " +x);
        }



    }



}
