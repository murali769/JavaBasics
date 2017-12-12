package com.Collections;

import java.util.Stack;

public class StackClass {


    public static void main(String[] args) {


        Stack<Integer> s=new Stack<>();
        for(int i=0;i<30;i++){

            if(i%3==0){

                s.add(i);

            }

        }
        System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println(s.search(66));
            System.out.println(s.pop());
            System.out.println(s);

        }
    }

}
