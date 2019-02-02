/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter09;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class CheckPalindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        if (isPalindrome(s))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
    
    public static boolean isPalindrome(String s)
    {
        int low = 0;
        
        int high = s.length() - 1;
        
        while (low < high)
        {
            if (s.charAt(low) != s.charAt(high))
                return false;
            
            low++;
            high--;
        }
        
        return true;
    }
}