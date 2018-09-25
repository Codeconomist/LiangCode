package liang8.Chapter02;
import java.util.Scanner;
/**
 *
 * @author harold
 */
public class Ch02PE11b {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter employee's name: ");
        String employee = input.next();
        
        System.out.println("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalWHT = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateWHT = input.nextDouble();
        
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
        
        System.out.println(output);
    }
}
