/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter07;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class CheckSudokuSolution
{
    public static void main(String[] args)
    {
        int[][] grid = readASolution();
        
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }
    
    public static int[][] readASolution()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i<9; i++)
        {
            for (int j = 0; j<9; j++)
            {
                grid[i][j] = input.nextInt();
            }
        }
        
        return grid;
    }
    
    public static boolean isValid(int[][] grid)
    {
        // Check whether each wrow has numbers 1-9
        for (int i = 0; i<9; i++)
            if(!is1To9(grid[i]))
                return false;
        
        // Check whether each column has numbers 1 to 9
        for (int j = 0; j<9; j++)
        {
            int[] column = new int[9];
            for (int i = 0; i<9; i++)
            {
                column[i] = grid[i][j];
            }
            
            if (!is1To9(column))
                return false;
        }
        
        // Check whether each 3x3 box contains numbers 1 to 9
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                int k = 0;
                int[] list = new int[9];
                for (int row = i * 3; row < i * 3 + 3; row++)
                    for (int column = j * 3; column < j * 3 + 3; column++)
                        list[k++] = grid[row][column];
                
                if(!is1To9(list))
                    return false;
            }
        }
        
        return true;
    }
    
    public static boolean is1To9(int[] list)
    {
        // Make a copy of the array
        int[] temp = new int[list.length];
        System.arraycopy(list, 0, temp, 0, list.length);
        
        // Sort the copied array
        java.util.Arrays.sort(temp);
        
        // Check whether the list contains 1, 2, 3, ..., 9
        for (int i = 0; i < 9; i++)
            if (temp[i] != i + 1)
                return false;
        
        return true;
    }
}
