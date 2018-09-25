/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter02;
import java.util.Scanner;
/**
 *
 * @author Rob
 */
public class DisplayTime {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
