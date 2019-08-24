package com.liang8.chapter04;
import java.util.Scanner;

public class Ch04PE44 {
    public static void main (String[] args)
    {
        final int NUMBER_OF_TRIALS = 10000000;

        Scanner input = new Scanner(System.in);
        int hitCount = 0;
        int runCount = 0;
        double xCoord;
        double yCoord;
        
        for (int i = 0; i < NUMBER_OF_TRIALS; i++)
        {
            xCoord = Math.random() * 2 - 1;
            yCoord = Math.random() * 2 - 1;
            
            if(xCoord<=0)
            {
                hitCount++;
            }
            else if (yCoord <= 0) {}
            else if ((xCoord+yCoord)/2 <= 0.5)
            {
                hitCount++;
            }

            runCount++;
        }
        
        System.out.println("Hitcount is " + hitCount);
        System.out.println("Out of     " + runCount);
        double probability = ((double)hitCount) / ((double)runCount);
        System.out.println("Probability is " + probability);
        System.out.println("After " + runCount + " iterations the probability of being in the odd section is " + probability);
    }
}