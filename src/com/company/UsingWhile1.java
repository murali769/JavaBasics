package com.company;

public class UsingWhile1 {

    public static void main(String[] args) {

        int i=100,count=0;
        boolean isTrue=true;

        while(i<=200 && isTrue){

            if(i%2!=0){
                System.out.println("Odd number"+i);
                count++;
            }
            if(count==10){
                isTrue=false;
            }
            i++;
        }
    }
}
