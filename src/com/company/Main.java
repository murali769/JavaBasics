package com.company;
import java.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();


        int j=10;
        int k=j++;
        int l=++j;
        int x=--l;


	switch(n){

        case 1:
        case 50:
            System.out.println("Monday");
            //break;

        case 2:
            System.out.println("Tuesday");
            break;

        case 3:
            System.out.println("Wednesday");
            break;

        case 4:
            System.out.println("Thursday");
            break;

        case 5:
            System.out.println("Friday");
            break;

        case 6:
            System.out.println("Saturday");
            break;

        case 7:
            System.out.println("Sunday");
            break;

            default:
                System.out.println("Wrong   Input!   Please   enter   a   number   between   1   to   7");
                break;
    }
    }
}
