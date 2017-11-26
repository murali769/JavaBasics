package com.company;

import java.util.Scanner;

public class Password {


    public static void main(String[] args) {

        int i = 0;
        boolean isTrue = true;
        int password = 1234;

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to Bank of Bob.Please enter your password: ");



        while (i <3 && isTrue) {


            int n = reader.nextInt();

            if (password == n) {

                System.out.println("Pin Accepted.Access Granted");
                isTrue = false;

            } else if(i<2) {

                    System.out.println("Incorrect Pin.Try Again.Enter your pin");
                    isTrue = true;

                }else if (i>=2){
                System.out.println("Too Many tries Acess denied");
            }

i++;
            }
    }

}
