package liang8.Chapter02;
import java.util.Scanner;

public class Ch02PE04 {
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
