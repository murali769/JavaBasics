package com.company;

public class Count {

    public int count(int a,int b){

           if(a>b){
            return a;

           }
         return b;
    }

    public float count(float a,float b){

        if(a>b){
            return a;

        }
        return b;
    }
    public int count(int a,int b,int c){

        if(a>b && a>c){

            return a;

        }else if(b>a && b>c){
            return b;
        }
       return c;
    }

    public float count(float a,float b,float c){

        if(a>b && a>c){

            return a;

        }else if(b>a && b>c){
            return b;
        }
        return c;
    }

    public static void main(String[] args) {


       Count c1=new Count();
      int z= c1.count(20,10);
       float x=c1.count(20.0f,10.0f);
       int y=c1.count(20,10,5);
       float q=c1.count(20.0f,10.0f,5.0f);
        System.out.println(z+" "+x+" "+y+ " "+q );



    }

    }
