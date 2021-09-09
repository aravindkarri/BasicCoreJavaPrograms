package com.bridgelabz;

import java.util.Scanner;

public class Swap
{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to perform swapping : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        swapWithoutUsingThirdVariable(num1,num2);
        //swapping of two numbers using third variable temp
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("first number after swapping is " + num1);
        System.out.println("second number after swapping is " + num2);

    }

    private static void swapWithoutUsingThirdVariable(int num1, int num2)
    {
        //swapping of two numbers without using third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("first number after swapping is " + num1);
        System.out.println("second number after swapping is " + num2);
    }

}
