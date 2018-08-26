package liang8.Chapter3;
import java.util.Scanner;
/**
 *
 * @author harold
 * Question:  Reads an integer and checks if it's odd
 */
public class Ch3PE02 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        double num = input.nextInt();
        
        boolean bOdd;
        
        if (num % 2 == 1)
        {
            bOdd = true;
        }
        else
        {
            bOdd = false;
        }
        System.out.println("Is " + (int)num + " an odd number?  " + bOdd);
    }
}
