package liang8.Chapter2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author robjc
 */
public class Ch2Review02
{
    public static void main (String[] args)
    {
        double miles = 100;
        final double MILES_PER_KILOMETER = 1.609;
        double kilometers;
        
        kilometers = miles * MILES_PER_KILOMETER;
        System.out.println(kilometers);
    }
}
