package liang8.Chapter2;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch2PE04 {
    public static void main(String[] args)
    {
        final double POUNDS_PER_KILOGRAM = 0.454;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
    
        double kilograms = pounds * POUNDS_PER_KILOGRAM;
    
        System.out.println(pounds + " pounds is " + kilograms);
    }
}
