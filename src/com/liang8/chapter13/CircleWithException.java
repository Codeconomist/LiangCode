package com.liang8.chapter13;

public class CircleWithException
{
    private double radius;
    
    private static int numberOfObjects = 0;
    
    public CircleWithException()
    {
        this(1.0);
    }
    
    public CircleWithException(double newRadius)
    {
        try
        {
            setRadius(newRadius);
            numberOfObjects++;
        }
        catch (InvalidRadiusException ex)
        {
            System.out.println("Radius error");
        }
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double newRadius) throws InvalidRadiusException
    {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }
    
    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    
    public double findArea()
    {
        return radius * radius * Math.PI;
    }
}