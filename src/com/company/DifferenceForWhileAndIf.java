package com.company;

import java.util.Scanner;

public class DifferenceForWhileAndIf {

    public static void whileOperation(int x){


        while(x<9){
            System.out.println("This is while loop" +x);
            x++;
        }
    }

    public  static void ifOperation(int z){

        if(z<9){
            System.out.println("This is if loop" +z);
           // z++;
        }
    }
        public static int addition(int a,int b){
            int c=a+b;
            return c;
        }
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("Please Enter Addition1");
        int z=sc.nextInt();
        System.out.println("Please Enter Addition2");
        int mn=sc.nextInt();

        DifferenceForWhileAndIf.ifOperation(i);
        DifferenceForWhileAndIf.whileOperation(i);
        int mn1=DifferenceForWhileAndIf.addition(8,10);
        System.out.println(i);
        System.out.println(mn1);
    }
}
