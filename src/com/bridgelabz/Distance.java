package com.bridgelabz;

import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X cordinate ::");
        double xCoOrdinate = scanner.nextDouble();
        System.out.println("Enter Y cordinate ::");
        double yCoOrdinate = scanner.nextDouble();
        scanner.close();

        double distance = measureDistance(xCoOrdinate, yCoOrdinate);

        System.out.format("The distance of (%.2f , %.2f) from origin is %.2f" ,
                xCoOrdinate , yCoOrdinate , distance);


    }
    public static double measureDistance(double xCoOrdinate, double yCoOrdinate)
    {
        return Math.pow((Math.pow(xCoOrdinate , 2) + Math.pow(yCoOrdinate , 2)), 0.5);
    }

}
