package com.Collections;

public class PrintingNumbersReverse {


    public static void main(String[] args) {

        int[] numbers=new int[20];

        for(int k=0;k<numbers.length;k++){
            numbers[k] = k + 1;
            System.out.println(numbers[k]);
        }

        for(int i=numbers.length-1;i>=0;i--){

        numbers[i]=numbers[i]+5;
        System.out.println(numbers[i]);
    }
    }
}

