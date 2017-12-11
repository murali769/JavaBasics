package com.Collections;

public class ArrayIntilization {


    public static int maxFunction(int[] arr1){


        int max=Integer.MIN_VALUE;
        for(int i:arr1){

            if(i>max){

                max=i;
            }


        }



        return max;
    }


    public static void main(String[] args) {


        int[] arr={3,6,1,5,15,12,2};

        System.out.println(maxFunction(arr));

    }



}
