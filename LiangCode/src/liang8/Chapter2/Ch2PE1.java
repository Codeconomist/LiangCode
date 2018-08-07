/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter2;
import java.util.Scanner;

/**
 *
 * @author Rob
 */
public class Ch2PE1
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in celcius: ");
        double celcius = input.nextDouble();
        
        double fahrenheit = (9.0/5 ) * celcius + 32;
        System.out.println("Your temperature in fahrenheit is: " + fahrenheit);
    }
}
