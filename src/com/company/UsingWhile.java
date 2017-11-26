package com.company;

import java.util.Scanner;

public class UsingWhile {

    public static void main(String[] args){

boolean isExit=true;

       while(true){


           Scanner reader = new Scanner(System.in);
           System.out.println("Enter the first number: ");
           int  i= reader.nextInt();
           System.out.println("Enter the Second number: ");
           int  j= reader.nextInt();


           System.out.println("Press 1 for Addition");
           System.out.println("Press 2 for Subtraction");
           System.out.println("Press 1 for Multiplication");
           System.out.println("Press 4 for Exit");
           int m=reader.nextInt();

           int k;

            switch(m){

                case 1:
                    k = i + j;
                    System.out.println("The result is" + k);
                    break;
                case 2:

                    k=i-j;
                    System.out.println("The result is" +k);
                    break;

                case 3:

                    k=i*j;
                    System.out.println("The result is" +k);
                    break;

                case 4:
                    isExit=false;
                    break;

            }
            if(m==4){

                System.out.println("Exiting");
                break;
            }
       }
        }



    }

