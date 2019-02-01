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
public class TestCircle1
{
    public static void main(String[] args)
    {
        Circle1 circle1 = new Circle1();
        System.out.println("The area of the circle of radius "
            + circle1.radius + " is " + circle1.getArea());
        
        Circle1 circle2 = new Circle1(25);
        System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());
        
        Circle1 circle3 = new Circle1(125);
        System.out.println("The area of the circle of radius "
            + circle3.radius + " is " + circle3.getArea());
        
        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());
    }
}