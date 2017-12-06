package com.W3ResoucePrograms;

import java.util.Scanner;

public class AreaOfPolygon {

    public static double areaOfPolygon(double s,double l){
        return ((s*l*l)/(4*Math.tan(Math.PI/s)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of sides");
        double i=sc.nextDouble();
        System.out.println("Please enter the length one of sides");
        double x=sc.nextDouble();
        System.out.println(AreaOfPolygon.areaOfPolygon(i,x));
    }
}
