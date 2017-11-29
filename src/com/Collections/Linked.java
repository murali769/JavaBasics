package com.Collections;

import java.util.LinkedList;
import java.util.List;

public class Linked {

    public  static int countEven(List<Integer> input){

        int count=0;
        for(Integer i:input){

            if(i%2==0){

                count++;
            }
        }
      return count;
    }

    public static List<Integer> add5(List<Integer> input){

        for(int i=0;i<input.size();i++){

            input.set(i,input.get(i)+5);
        }

        return input;
    }

    public static void main(String[] args) {

        List<Integer> li=new LinkedList<>();

        for(int i=1;i<=20;i++){

            li.add(i*5);
        }
        int c=countEven(li);

        System.out.println(c);
        for(int i=li.size()-1;i>=0;i--){

            System.out.println(li.get(i));

        }
        List<Integer> z = add5(li);

        for(int i=z.size()-1;i>=0;i--){

            System.out.println(z.get(i) + " List "  +li.get(i));


        }


    }


}
