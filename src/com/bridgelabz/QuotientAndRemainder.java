package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder
{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend divisor: ");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        scanner.close();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
