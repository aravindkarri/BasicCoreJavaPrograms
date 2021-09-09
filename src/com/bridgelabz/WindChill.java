package com.bridgelabz;

import java.util.Scanner;

public class WindChill
{
    public static void main(String[] args)
    {
        calculateWindChill();
    }

    private static void calculateWindChill()
    {
        double t, v, windchill; //represents temperature, velocity and wind chill
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature and speed of the air: ");
        t = scanner.nextInt();
        v = scanner.nextInt();

        scanner.close();

        if(t > 50)
        {
            System.err.println("temperature should not be greater than 50");
            System.exit(0);
        }
        if((v > 120) || (v < 3))
        {
            System.err.println("velocity should be greater than 3 and less than 120");
            System.exit(0);
        }

        windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
        System.out.println("Windchill : " + windchill);
    }
}
