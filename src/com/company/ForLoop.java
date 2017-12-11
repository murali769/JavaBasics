package com.company;

public class ForLoop {


    public static void main(String[] args) {

        int j=10;
        for(;j<20;j++){
            System.out.println("This is inside loop "+j);
        }
        System.out.println("This is outside loop "+j);
        int c=j+10;
        System.out.println(c);
    }
}
