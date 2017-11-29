package com.Arrays;

public class PrintingNumbersReverse {


    public static void main(String[] args) {
        int[] numbers=new int[20];

        for(int k=5;k<numbers.length;k++){
            numbers[k]=k+1;
            System.out.println("Numbers are" +numbers);
        }

    }
}
