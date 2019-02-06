package liang8.Chapter02;
import java.util.Scanner;

/**
 * Question:  Rewrite listing 2.10, ComputeChange.java, to fix the possible loss
 * of accuracy when converting a double value to an int value.  Enter the input 
 * as an integer whose last two digits represent the cents.
 */
public class Ch02PE09 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);     // Create a scanner
        
        System.out.print("Enter an amount in double, for example 11.56: ");
        int amount = input.nextInt();
        
        int remainingAmount = amount % 100;
        
        //  Find the number of one dollars straight away
        int numberOfOneDollars = (amount - remainingAmount) / 100;
        
        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        //Find the number of Dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        //Find the number of Nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        //Display results
        System.out.println("Your amount " + amount + " consists of \n" +
        "\t" + numberOfOneDollars + " dollars \n" +
        "\t" + numberOfQuarters + " quarters \n" +
        "\t" + numberOfDimes + " dimes \n" +
        "\t" + numberOfNickels + " nickels \n" +
        "\t" + numberOfPennies + " pennies");
    }
}
