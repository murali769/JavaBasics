package com.W3ResoucePrograms;

import java.util.Scanner;

public class AreaOfCircle {

    public static double area(int x){
        return 3.14*x*x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plese enter the radius of the circle ");
        int x=sc.nextInt();
        System.out.println(area(x));
    }

}
