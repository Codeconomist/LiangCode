/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter09;

/**
 *
 * @author harold
 */
public class WriteData
{
    public static void main(String[] args) throws Exception
    {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists())
        {
            System.out.println("File already exists");
            System.exit(0);
        }
        
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones");
        output.println(85);
        
        output.close();
    }
}