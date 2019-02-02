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
public class CountEachLetter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        int[] counts = countLetters(s.toLowerCase());
        
        for (int i = 0; i < counts.length; i++)
        {
            if (counts[i] != 0)
                System.out.println((char)('a' + i) + " appears " +
                    counts[i] + ((counts[i] == 1) ? " time" : " times"));
        }
    }
    
    public static int[] countLetters(String s)
    {
        int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
                counts[s.charAt(i) - 'a']++;
        }
        
        return counts;
    }
}