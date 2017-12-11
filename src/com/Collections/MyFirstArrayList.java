package com.Collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MyFirstArrayList {


    static int getcapacity(ArrayList l)throws Exception  {
        Field f = ArrayList.class.getDeclaredField("elementData");
        f.setAccessible(true);
        return ((Object[])f.get(l)).length;
    }
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> li=new ArrayList<Integer>(5);

        for(int i=200;i<=300;i++){

            if(i%4==0){
                li.add(i);
                System.out.println("Size is "+li.size()+ " Capacity is "+getcapacity(li));

            }
        }

        System.out.println(li);

    }
}
