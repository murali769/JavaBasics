package com.company;

public class Inheritance {


    public static void main(String[] args) {




        ClassA c=new ClassA(1,2,3);

        System.out.println("Sum is " +c.sum());

        System.out.println("Difference is " +c.subtraction());

ClassB c1=new ClassB(1,2,3,4);
        System.out.println("The sum is " +c1.sum());
        System.out.println("The difference is " +c1.subtraction());
        System.out.println("The multi is " +c1.multipication());
        System.out.println("The division is " +c1.division());
    }

}
