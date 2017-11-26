package com.company;

import java.util.Scanner;

public class Maths {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter B");
        int b=sc.nextInt();
        System.out.println("Enter C");
        int c=sc.nextInt();

        Calculator cal=new Calculator();
        int result=cal.addition(a,b);
        System.out.println(result);
        float result2=cal.addition(2.5f,1.5f);


    }


}
