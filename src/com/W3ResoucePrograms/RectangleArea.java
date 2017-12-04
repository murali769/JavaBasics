package com.W3ResoucePrograms;

import com.company.Rectangle;

import java.util.Scanner;

public class RectangleArea {

    public int area(int x,int y){
        int c=x*y;

        return c;
    }
    public int perimeter(int a,int b){
       int z=2*(a+b);

        return z;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Width");
        int a=sc.nextInt();
        System.out.println("Please Enter the Height");
        int b=sc.nextInt();

        RectangleArea z=new RectangleArea();
        System.out.println("The area is " +z.area(a,b));
        System.out.println("The perimeter is " +z.perimeter(a,b));


    }

}
