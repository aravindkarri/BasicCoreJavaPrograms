package com.bridgelabz;

import java.util.Scanner;

public class SumOfThreeIntegers
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements do you want to add ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter array elements: ");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n =arr.length;
        findTriplets(arr, n);
    }

    private static void findTriplets(int[] arr, int n)
    {
        boolean found = false;
        int tripletsCount =0;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        tripletsCount++;
                        found = true;
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets :" + tripletsCount);
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }
}
