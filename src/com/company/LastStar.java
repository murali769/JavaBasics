package com.company;

public class LastStar {

    public static void main(String[] args) {

int k=8;
        for(int i=0;i<5;i++){
            for(int j=0;j<k;j++){
                System.out.print(" ");

            }

            for(int j=0;j<=i;j++){


                System.out.print("* ");
            }
            k=k-2;

            System.out.println("");

        }

    }
}
