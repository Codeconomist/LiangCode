package liang8.Chapter2;
import javax.swing.JOptionPane;
/**
 *
 * @author harold
 * Question:  Write a program that reads the following information and prints a payroll statement:
 *              Employee name
 *              Number of hours worked in a week
 *              Hourly pay rate
 *              Federal tax withholding rate
 *              State tax withholding rate
 * 
 *            Write this program in two versions:
 *              a) use dialog boxes to obtain input and display output
 *              b) Use console input and output
 */
public class Ch2PE11 {
    public static void main(String[] args)
    {
        String sInput = JOptionPane.showInputDialog("Enter employee's name: ");
        String employee = sInput;
        sInput = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
        double hoursWorked = Double.parseDouble(sInput);
        sInput = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double hourlyPay = Double.parseDouble(sInput);
        sInput = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
        double federalWHT = Double.parseDouble(sInput);
        sInput = JOptionPane.showInputDialog("Enter state tax withholding rate: ");
        double stateWHT = Double.parseDouble(sInput);
        
        double grossPay = hoursWorked * hourlyPay;
        double fedWHTval = grossPay * federalWHT;
        double stateWHTval = grossPay * stateWHT;
        double deductions = fedWHTval + stateWHTval;
        double netPay = grossPay - deductions;
        
        String output = "Employee Name: " + employee + "\n" +
        "Hours worked: " + hoursWorked + "\n" +
        "Pay rate: " + hourlyPay + "\n" +
        "Gross pay: " + grossPay + "\n" +
        "Deductions: \n" +
        "  Federal Withholding (" + federalWHT*100 +"%): " + fedWHTval + "\n" +
        "  State Withholding (" + stateWHT*100 + "%): " + stateWHTval + "\n" +
        "  Total Deduction: \t$" + deductions + "\n" +
        "Net Pay:\t$" + netPay;
        
        JOptionPane.showMessageDialog(null, output);
    }
}
