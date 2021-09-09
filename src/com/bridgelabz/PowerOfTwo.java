package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter power value: ");
        int exponent = scanner.nextInt();
        scanner.close();
        System.out.println("==========================");
        System.out.println("i       2 to power i   ");
        System.out.println("==========================");
        //2^31 overflows an int so exponent values should be b/w o to 31
        if (exponent>=0 && exponent<31)
        {
            for (int i=0;i<=exponent;i++)
            {
                int result = (int) Math.pow(2, i);
                System.out.println(i+"            "+result);
            }
        }
        else
        {
            System.err.println("Enter a valid exponent value b/w 0 to 31");
        }
    }
}
