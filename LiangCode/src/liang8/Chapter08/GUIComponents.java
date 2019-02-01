/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liang8.Chapter08;
import javax.swing.*;
/**
 *
 * @author harold
 */
public class GUIComponents
{
    public static void main(String[] args)
    {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JLabel jlblName = new JLabel("Enter your name: ");
        JTextField jtfName = new JTextField("Type Name Here");
        JCheckBox jchkBold = new JCheckBox("Bold");
        JCheckBox jchkItalic = new JCheckBox("Italic");
        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        JComboBox jcboColour = new JComboBox(new String[]{"Freshman",
            "Sophomore", "Junior", "Senior"});
        
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        panel.add(jlblName);
        panel.add(jtfName);
        panel.add(jchkBold);
        panel.add(jchkItalic);
        panel.add(jrbRed);
        panel.add(jrbYellow);
        panel.add(jcboColour);
        
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Show GUI Components");
        frame.setSize(450, 100);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}