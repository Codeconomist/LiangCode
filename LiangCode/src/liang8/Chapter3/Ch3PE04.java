package liang8.Chapter3;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch3PE04 {
    public static void main (String[] args)
    {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        
        Scanner input = new Scanner(System.in);
        boolean outcome;
        
        System.out.println("Enter the sum of " + a + " and " + b);
        int c = input.nextInt();
        
        if (c == (a + b))
        {
            outcome = true;
        }
        else
        {
            outcome = false;
        }
        
        System.out.println(outcome);
    }
    
}
