package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get prime factors :");
        int number = sc.nextInt();
        sc.close();

        for(int i = 2; i< number; i++)
        {
            while(number%i == 0)
            {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2)
        {
            System.out.println(number);
        }
    }
}
