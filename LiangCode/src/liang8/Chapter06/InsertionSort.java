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
public class InsertionSort
{
    public static void insertionSort(double[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            double currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--)
            {
                list[k + 1] = list[k];
            }
            
            list[k + 1] = currentElement;
        }
    }
}