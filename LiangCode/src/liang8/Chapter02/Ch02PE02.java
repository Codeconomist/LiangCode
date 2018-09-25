package liang8.Chapter02;
import java.util.Scanner;

/**
 *
 * @author harold
 * Question:
 * Read the radius and length of a cylinder and compute the volume.  
 */
public class Ch02PE02 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        double area = java.lang.Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
    
}
