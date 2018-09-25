/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter02;

/**
 *
 * @author Rob
 */
public class ComputeArea {
    public static void main (String[] args) {
        double radius;
        double area;
        
        radius = 20;
        area = radius * radius *java.lang.Math.PI;
        System.out.println("The area for the circle of radius "
                + radius + " is "+area);
    }
}
