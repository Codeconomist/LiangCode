package liang8.Chapter02;
import java.util.Scanner;
/**
 *
 * @author harold
 * Question:  Convert a lower case letter to an upper case letter.
 */
public class Ch02PE07 {
    public static void main (String[] args)
    {        
        Scanner input = new Scanner(System.in);
        char lowercase = 'h';
        
        int offset = 'a' - (int) 'A';
        int unicodeForLowerCase = (int)lowercase;
        int unicodeForUpperCase = unicodeForLowerCase - offset;
        char uppercase = (char) unicodeForUpperCase;
        
        System.out.println("The lowercase letter is " + lowercase);
        System.out.println("The uppercase letter is " + uppercase);
    }
    
}
