package com.liang8.chapter02;
import java.util.Scanner;
/**
 * Question:  Enter the subtotal and gratuity rate to calculate the gratuity and total
 */
public class Ch02PE05 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter teh subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);
    }
    
}
