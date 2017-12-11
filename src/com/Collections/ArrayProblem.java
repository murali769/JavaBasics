package com.Collections;

import java.util.Scanner;

public class ArrayProblem {

    public static void addingNumbers(int arr[]){

for(int i=1;i<arr.length;i++){

    if((arr[i]%2) == 0){
arr[i]=arr[i]+1;
        System.out.println(arr[i]);

    }else if(arr[i]!=0){
        arr[i]=arr[i]+2;
        System.out.println(arr[i]);
    }
    }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the range of numbers you want to check:");
        int i=sc.nextInt();
        int[] arr=new int[i];
        for(int j=1;j<arr.length;j++){
            arr[j]=j;
        }

ArrayProblem.addingNumbers(arr);

    }

}
