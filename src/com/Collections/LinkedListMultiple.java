package com.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMultiple {


    public static void main(String[] args) {


        List<Integer> li=new LinkedList<>();

        for(int i=0;i<=300;i++){

            if(i%6==0 ){

                li.add(i);

            }
        }
        for(Integer i:li){

            System.out.println(i);
        }
    }
}
