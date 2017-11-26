package com.company;

import java.*;
import java.util.*;

public class ThirdProgram {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Month");
        int month = reader.nextInt();

        //Scanner reader = new Scanner(System.in);
        System.out.println("Enter Day");
        int day = reader.nextInt();

        if( (month==12 && day>=16) || (month==1) || (month==2) || (month==3 && day<=15) ){

            System.out.println("Winter");

        }else if((month == 3 && day>=16) || (month ==4) || (month==5) || (month==6 && day<=15) ){
            System.out.println("Spring");
        }else if( (month == 6 && day>=16) || (month ==7) || (month ==8) || (month ==9 && day<=15)) {


            System.out.println("Summer");
        }else if( (month==9 && day>=16)|| (month ==10) || (month ==11) || (month ==12 && day<=15) ){

            System.out.println("Fall");
        }

    }
}
