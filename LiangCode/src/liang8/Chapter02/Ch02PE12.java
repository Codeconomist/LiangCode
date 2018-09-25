package liang8.Chapter02;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch02PE12 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter balance: ");
        double balance = input.nextDouble();
        
        System.out.println("Enter annual interest rate (e.g., 5.2 for 5.2%): ");
        double annualInterestRate = input.nextDouble();
        
        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest + " and the new balance is " + (balance + interest));
    }
}
