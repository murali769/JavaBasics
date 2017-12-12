package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCalss {


    public static void main(String[] args) {


        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<=10;i++){

            q.add(i);

        }
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.poll());
            System.out.println(q.peek());
            System.out.println(q);

        }

    }

}
