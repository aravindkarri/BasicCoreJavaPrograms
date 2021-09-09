package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter harmonic value: ");
        int number = sc.nextInt();
        double harmonicNum =0;
        if (number > 0)
        {
            for (double i=1;i<=number;i++)
            {
                harmonicNum += (1/i);
            }
            System.out.println("Nth harmonic number is :"+harmonicNum);
        }
        else
        {
            System.err.println("Enter positive value");
        }
    }
}
