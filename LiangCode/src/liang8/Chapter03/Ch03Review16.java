/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter03;

/**
 *
 * @author harold
 */
public class Ch03Review16 {
    public static void main (String[] args)
    {
        int num = -1;
        boolean x;
        if (((num > 1) && (num < 100)) || num < 0)
            x = true;
        else
            x = false;
        System.out.println(x);
    }
    
}