package com.liang8.chapter03;
import java.util.Scanner;

public class Ch03PE04 {
    public static void main (String[] args)
    {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        
        Scanner input = new Scanner(System.in);
        boolean outcome;
        
        System.out.println("Enter the sum of " + a + " and " + b);
        int c = input.nextInt();
        
        if (c == (a + b))
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