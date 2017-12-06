package com.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListProblem {

    public static void listOfIntegers(List<Integer> input){

        for (Integer i:input){
        if(i%2==0){

            i=i+1;
            System.out.println(i);
        }else if(i%2!=0){

            i=i+2;
            System.out.println(i);

        }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<Integer> li=new LinkedList<>();
        for(int j=1;j<=10;j++){
            li.add(j);
        }
LinkedListProblem.listOfIntegers(li);
    }
}
