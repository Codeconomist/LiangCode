/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter10;

/**
 *
 * @author harold
 */
public class UseBMIClass
{
    public static void main(String[] args)
    {
        BMI bmi1 = new BMI("John Doe", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
            + bmi1.getBMI() + " " + bmi1.getStatus());
        
        BMI bmi2 = new BMI("Peter King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
            + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
