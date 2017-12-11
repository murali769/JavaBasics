package com.company;

public class ContinueStatement {


    public static void main(String[] args) {


        for(int i=0;i<10;i++){

            if(i%2==0){
                System.out.println("This is Continue "+i);
                continue;
            }else{
                System.out.println(i);
            }


            System.out.println("This is end of for loop "+i);
        }


    }



}
