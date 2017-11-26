package com.company;

import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter your Number:");
        int n=reader.nextInt();
        int lagestPrime=0;

for(int i = 2;i<=n;i++){

    while(n%i == 0) {

        lagestPrime=i;
        n=n/i;

    }

}
        System.out.println("largest prime" +lagestPrime);

    }


}
