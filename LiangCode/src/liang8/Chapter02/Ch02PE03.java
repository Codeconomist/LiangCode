package liang8.Chapter02;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch02PE03 {
    public static void main (String[] args)
    {
        final double INCHES_PER_CENTIMETER = 0.3937;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter centimeters as an integer:  ");
        int iCentimeters = input.nextInt();
        
        double inches = (double) iCentimeters * INCHES_PER_CENTIMETER;
        System.out.println("The value in inches is " + inches);
    }
}
