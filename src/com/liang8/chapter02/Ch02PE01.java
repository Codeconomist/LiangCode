package liang8.Chapter02;
import java.util.Scanner;

public class Ch02PE01
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in celcius: ");
        double celcius = input.nextDouble();
        
        double fahrenheit = (9.0/5 ) * celcius + 32;
        System.out.println("Your temperature in fahrenheit is: " + fahrenheit);
    }
}
