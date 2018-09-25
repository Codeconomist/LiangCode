package liang8.Chapter02;
import java.util.Scanner;
/**
 *
 * @author harold
 * Question:  write a program that receives the ASCII code and displays its character.
 */
public class Ch02PE08 {
    public static void main (String[] args)
    {
        System.out.println("Enter an ASCII code: ");
        Scanner input = new Scanner(System.in);
        
        int code = input.nextInt();
        char character = (char) code;
        
        System.out.println("The character for ASCII code " + code + " is " + character);
    }
    
}
