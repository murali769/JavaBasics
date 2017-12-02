package com.W3ResoucePrograms;

import java.util.Scanner;

public class AverageOfThreeNumbers {


    public static double average(int x,int y,int z){

        return (x+y+z)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the first number:");
        int x=sc.nextInt();
        System.out.println("Please Enter the Second Number:");
        int y=sc.nextInt();
        System.out.println("Please enter the Third number:");
        int z=sc.nextInt();
        System.out.println(average(x,y,z));
    }
}
