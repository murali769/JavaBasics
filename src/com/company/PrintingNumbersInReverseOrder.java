package com.company;

public class PrintingNumbersInReverseOrder {


    public static void main(String[] args) {



        int i=30;


        while(i>=0){

            if(i%2==0){

                System.out.println(i);

            }else{
                i--;
                continue;
            }

            i--;
        }

    }

}
