package com.liang8.chapter03;
import java.util.Scanner;

/**
 * Question:  Modify PE04 to generate 3 numbers and get the user to enter the lowest of the 3.
 */
public class Ch03PE05 {
    public static void main (String[] args)
    {
        int a = (int)(Math.random() * 8 + 1);
        int b = (int)(Math.random() * 8 + 1);
        int c = (int)(Math.random() * 8 + 1);
        
        Scanner input = new Scanner(System.in);
        boolean outcome;
        
        System.out.println("Enter the lowest of " + a + ", " + b + " and " + c);
        int userNum = input.nextInt();

        if (userNum == Math.min(c, Math.min(a, b)))
        {
            outcome = true;
        }
        else
        {
            outcome = false;
        }
        
        System.out.println(outcome);
    }
}