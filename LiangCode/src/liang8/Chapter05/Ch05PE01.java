package liang8.Chapter05;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch05PE01 {
    public static void main(String[] args)
    {
        final int NUMBERS_PER_LINE = 10;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of steps for the Triangular number:  ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            if (i % NUMBERS_PER_LINE == 0)
            {
                System.out.printf("%6s\n", getTriangularNumber(i));
            }
            else
                System.out.printf("%6s", getTriangularNumber(i));
        }
    }
    
    public static int getTriangularNumber(int n)
    {
        int value = 0;
        for (int i = 1; i <= n; i++)
        {
            value = value + i;
        }
        
        return value;
    }
       
}