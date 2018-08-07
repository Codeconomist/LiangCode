/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang8.Chapter2;
import javax.swing.JOptionPane;
/**
 *
 * @author Rob
 */
public class DisplayUnicode
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,
                "\u6B22\u8FCE \u03b1 \u03b2 \u03b3",
                "\u6B22\u8FCE Welcome",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
