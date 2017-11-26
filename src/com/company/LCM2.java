package com.company;

import java.util.Scanner;

public class LCM2 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int c=sc.nextInt();
        System.out.println("Enter the second number");
        int d=sc.nextInt();

        LCM lc=new LCM();


        int r=lc.lcmOfNumbers(c,d);
        System.out.println("The lcm of two numbers is " +r);



    }


}
