package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = scanner.nextInt();
        System.out.print("Enter the second number :");
        int b = scanner.nextInt();
        System.out.print("Enter the third number :");
        int c = scanner.nextInt();
        scanner.close();
        if(a>b && a>c)
        {
            System.out.println("Largest number is :" +a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest number is :" +b);
        }
        else
        {
            System.out.println("Largest number is :" +c);
        }
    }
}
