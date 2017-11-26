package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please Enter your Birth Year: ");
        int n = reader.nextInt();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(" You have encountered the following leap years in your lifetime:");

        for (; n <= year; n++) {

            if ((n % 4 == 0) && (n % 100 != 0)) {

                System.out.println(+n);
            }else if ((n % 4 == 0) && (n % 100 == 0) && (n % 400 == 0))
            {
                System.out.println(+n);
            }
        }

    }
}

