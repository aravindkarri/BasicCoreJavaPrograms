package com.bridgelabz;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not");
        int yearToCheck = scanner.nextInt();
        scanner.close();
        leapYear(yearToCheck);
    }

    private static void leapYear(int yearToCheck)
    {
        if(Integer.toString(yearToCheck).length() == 4)  //Ensure year length is 4
        {
            if(yearToCheck%4 == 0 && yearToCheck%100 != 0)
            {
                System.out.println(+yearToCheck+ " is leap year");
            }
            else if(yearToCheck%100 == 0 && yearToCheck%400 == 0)
            {
                System.out.println(+yearToCheck+" is leap year");
            }
            else
            {
                System.out.println(+yearToCheck+ " is not a leap year");
            }
        }
        else
        {
            System.err.println("Entered year is not valid");
        }
    }
}
