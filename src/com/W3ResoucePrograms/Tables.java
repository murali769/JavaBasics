package com.W3ResoucePrograms;

import java.util.Scanner;

public class Tables {


    public static int multiplication(int x){


        int c=0;
        for(int i=1;i<=10;i++){
            c=x*i;
            System.out.println(x+  "* " +i+ "= "  +c);
        }
        return c;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the number that you need to get multiplied");
        int i=sc.nextInt();
        multiplication(i);

    }

}
