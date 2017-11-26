package com.company;

public class StaticVariableClass {


    public int i;
    static int j;


    public StaticVariableClass(){

        System.out.println("Hi" );
        i++;
        j++;
    }

    public static void example(){

        System.out.println(j);
        StaticVariableClass s=new StaticVariableClass();
        System.out.println(s.i);

    }
    public void example2(){


        System.out.println(StaticVariableClass.j);

    }

    public static void main(String[] args) {

        for(int ravi=0;ravi<10;ravi++){
            System.out.println("Before object creation");
            StaticVariableClass s1=new StaticVariableClass();
            System.out.println(s1.i+" "+j);

        }


    }


}
