/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter03;
import java.util.Scanner;
/**
 *
 * @author Rob
 */
public class AdditionQuiz
{
    public static void main(String[] args)
    {
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);
        
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        
    }
}
