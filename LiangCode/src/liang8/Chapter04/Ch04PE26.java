package liang8.Chapter04;
import java.util.Scanner;

public class Ch04PE26 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of iterations for the calculation of e:");
        int loopEnd = input.nextInt();
        double dblRunningDivisor = 1;
        double e = 1;
        for (int i = 1; i <= loopEnd; i++)
        {
            dblRunningDivisor = dblRunningDivisor * i;
            e = e + (1/dblRunningDivisor);
        }
        
        System.out.println("Estimate of e = " + e);
    }
}
