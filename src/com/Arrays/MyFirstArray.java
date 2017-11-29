package com.Arrays;

public class MyFirstArray {



    public static void modify(int arr[]){

        for(int i=0;i<arr.length;i++){

            arr[i]+=1;


        }
    }
public static void modify(int i){

        i=i+1;
    System.out.println("Inside Modify function " +i);


}
    public static void main(String[] args) {



        int i=10;
        int[] arr=new int[i];
        for(int j=0;j<arr.length;j++){

            arr[j]=j*2;

        }
        int c=0;
        for(int j=0;j<arr.length;j++){
            c=c+arr[j];
        }
        System.out.println("Sum of all numbers is " +c);


        modify(arr);
        for(int k=0;k<arr.length;k++){

            System.out.println(arr[k]);

        }
        modify(c);
        System.out.println("C is " +c);
    }

}
