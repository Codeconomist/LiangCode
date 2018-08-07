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
public class FarenheitToCelsius {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a degree in Farenheit: ");
        double farenheit = input.nextDouble();
        
        double celsius = (5.0/9)*(farenheit-32);
        System.out.println("Farenheit " + farenheit + " is " + celsius + " in Celsius");
    }
    
}
