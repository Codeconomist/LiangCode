/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter2;
import java.util.Scanner;
/**
 *
 * @author Rob
 */
public class SalesTax {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is " + (int)(tax*100)/100.0);
    }
    
}
