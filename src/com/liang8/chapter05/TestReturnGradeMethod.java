package com.liang8.chapter05;

public class TestReturnGradeMethod {
    public static void main (String[] args)
    {
        System.out.println("The grade is " + getGrade(78.5));
        System.out.println("The grade is " + getGrade(59.5));
    }
    
    public static char getGrade(double score)
    {
        if (score >= 90.0)
        {
            return 'A';
        }
        if (score >= 80.0)
        {
            return 'B';
        }
        if (score >= 70.0)
        {
            return 'C';
        }
        if (score >= 60.0)
        {
            return 'D';
        }
        else
            return 'F';
    }
}
