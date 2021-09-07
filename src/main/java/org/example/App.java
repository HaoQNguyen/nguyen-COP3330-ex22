/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static boolean checkDifference(double no1, double no2, double no3)
    {
        return no1 != no2 && no1 != no3 && no2 != no3;
    }

    public static double findMax(double no1, double no2, double no3)
    {
        double max = no1;
        if (max < no2)
        {
            max = no2;
        }
        if (max < no3)
        {
            max = no3;
        }
        return max;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double no1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double no2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double no3 = input.nextDouble();

        if (checkDifference(no1, no2, no3))
        {
            System.out.printf("The largest number is %.2f", findMax(no1, no2, no3));
        }
        else
        {
            System.out.println("The three numbers are not different!");
        }
    }
}
