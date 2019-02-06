package liang8.Chapter06;
import java.util.Scanner;
/**
 * Once run, this will take sequential user inputs for the numbers from 1-99 and cease when 0 is entered.
 * It can be run through command line with redirected STDIN
 */
public class LottoNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean[] isCovered = new boolean[99];
        
        int number = input.nextInt();
        while (number != 0)
        {
            isCovered[number - 1] = true;
            number = input.nextInt();
        }
        
        boolean allCovered = true;
        for (int i = 0; i < 99; i++)
            if (!isCovered[i])
            {
                allCovered = false;
                break;
            }
        
        if (allCovered)
            System.out.println("The tickets cover all numbers");
        else
            System.out.println("The tickets don't cover all numbers");
    }
}
