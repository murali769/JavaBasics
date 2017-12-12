package com.Collections;

import java.util.Stack;

public class StackExample {


    public  static boolean stringMatch(String s){

        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){

            Character c=s.charAt(i);
            System.out.println(c);

            if(c=='('){

                s1.push(c);

            }else{

                if(s1.isEmpty()){

                    return false;
                }else{
                    s1.pop();
                }
            }
        }
        if(!s1.isEmpty()){

            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s="(((())))";
        String s2="(()()())";
        String s3="()())()(";
        String temp="()()()(((())() ";
        System.out.println(stringMatch(temp));

    }
}
