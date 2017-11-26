package com.company;

public class LCM {

    public int lcmOfNumbers(int a, int b){
        int max,min,x;
        int lcm=0;

        if(a>b){

            max=a;
            min=b;
        }else{

            max=b;
            min=a;
        }
        for(int i=1;i<=min;i++){
            x=max*i;
            if(x%min==0){
                lcm=x;
                break;
            }
        }
        return lcm;
    }



}
