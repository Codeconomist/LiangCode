package liang8.Chapter3;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch3PE01 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1, r2;
        
        if (discriminant > 0)
        {
            r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (discriminant == 0)
        {
            r1 = (-b + discriminant) / (2 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }
    }
}
