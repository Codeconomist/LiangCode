/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter08;

/**
 *
 * @author harold
 */
public class Circle3
{
    private double radius = 1;
    
    private static int numberOfObjects = 0;
    
    public Circle3()
    {
        numberOfObjects++;
    }
    
    public Circle3(double newRadius)
    {
        radius = newRadius;
        numberOfObjects++;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double newRadius)
    {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    
    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
}