package com.liang8.chapter02;
import javax.swing.JOptionPane;
/**
 * Question:  Rebuild the ComputeChange.java to use JOptionPane.
 *              I was slack and used my previous answer, based on integers
 */
public class Ch02PE10 {
        public static void main (String[] args)
    {
        String sInput = JOptionPane.showInputDialog("Enter an amount as an integer, for example 1156");
        
        int amount = Integer.parseInt(sInput);
        
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
        String output = "Your amount " + amount + " consists of \n" +
        "\t" + numberOfOneDollars + " dollars \n" +
        "\t" + numberOfQuarters + " quarters \n" +
        "\t" + numberOfDimes + " dimes \n" +
        "\t" + numberOfNickels + " nickels \n" +
        "\t" + numberOfPennies + " pennies";
        
        JOptionPane.showMessageDialog(null, output);
    }
}
