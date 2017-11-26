package com.company;

import java.*;
import java.util.*;

public class SecondProgram {

public static String getSeason(int i){


    if(i==1 || i==2 ||i==3){

       // System.out.printf("this is spring");
        return "Spring";
    }else if(i==4 || i==5 ||i==6){

        //System.out.printf("This is Fall");
        return "Fall";

    }else if(i==7 || i==8 ||i==9) {

        //System.out.printf("This is Winter");
        return "Winter";
    }
        else {
        return "Invalid";
    }
}


public static void printSeason(int a){




    if(a==1 || a==2 ||a==3){

        System.out.printf("Print this is spring");

    }else if(a==4 || a==5 ||a==6){

        System.out.printf("Print This is Fall");


    }else if(a==7 || a==8 ||a==9) {

        System.out.printf("Print This is Winter");
    }else{
        System.out.printf("Print Invalid Input");
    }

}
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Number for Seasons:");
        int i = reader.nextInt();
        String x= SecondProgram.getSeason(i);

        System.out.println("This is " +x);

        SecondProgram.printSeason(i);

        /*switch (i){

        case 1:
        case 2:
        case 3:
        System.out.println("Winter");
        break;


        case 4:
        case 5:
        case 6:
        System.out.println("Spring");
        break;


        case 7:
        case 8:
        case 9:
        System.out.println("Summer");
        break;

        case 10:
        case 11:
        case 12:
        System.out.println("Fall");
        break;


    }*/


    }

}

