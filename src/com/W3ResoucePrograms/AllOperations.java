package com.W3ResoucePrograms;

import java.util.Scanner;

public class AllOperations {

    public static void  Operations(int x,int y){


        System.out.println(x*y);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x%y);

    }


    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int x=sc.nextInt();
        System.out.println("Please enter the second number");
        int y=sc.nextInt();

        AllOperations.Operations(x,y);


    }


}
