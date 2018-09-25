package liang8.Chapter05;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Decimal2HexConversion {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        System.out.println("The hex number for decimal " + decimal + " is " + decimalToHex(decimal));
    }
    
    public static String decimalToHex(int decimal)
    {
        String hex = "";
        
        while (decimal != 0)
        {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }
        
        return hex;
    }
    
    public static char toHexChar(int hexValue)
    {
        if (hexValue <= 9 && hexValue >= 0)
            return (char)(hexValue + '0');
        else
            return (char)(hexValue - 10 + 'A');
    }
}