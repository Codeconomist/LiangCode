/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter06;

/**
 *
 * @author harold
 */
public class LinearSearch
{
    public static int linearSearch(int[] list, int key)
    {
        for (int i = 0; i < list.length; i++)
        {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
