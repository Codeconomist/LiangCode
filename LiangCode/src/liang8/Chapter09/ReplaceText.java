/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter09;
import java.io.*;
import java.util.*;
/**
 *
 * @author harold
 */
public class ReplaceText
{
    public static void main(String[] args) throws Exception
    {
        if (args.length != 4)
        {
            System.out.println(
                "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(0);
        }
        
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists())
        {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(0);
        }
        
        File targetFile = new File(args[1]);
        if (targetFile.exists())
        {
            System.out.println("Target file " + args[1] + " already exits");
            System.exit(0);
        }
        
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
        
        while (input.hasNext())
        {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            output.println(s2);
        }
        
        input.close();
        output.close();
    }
}