package liang8.Chapter03;
import java.util.Scanner;
/**
 * Question:  Use Cramer's rule to solve the 2x2 system of linear equations
 * ax + by = e
 * cx + dy = f
 */
public class Ch03PE03 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double check = (a * d) - (b * c);
        
        if (check == 0)
        {
            System.out.println("The equation has no solution.");
        }
        else
        {
            double x = ((e * d) - (b * f)) / check;
            double y = ((a * f) - (e * c)) / check;
            
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}