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
public class TestCircle3
{
    public static void main(String[] args)
    {
        Circle3 myCircle = new Circle3(5.0);
        System.out.println("The area of the circle of radius "
            + myCircle.getRadius() + " is " + myCircle.getArea());
        
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
            + myCircle.getRadius() + " is " + myCircle.getArea());
        
        System.out.println("The number of objects created is "
            + Circle3.getNumberOfObjects());
    }
}
