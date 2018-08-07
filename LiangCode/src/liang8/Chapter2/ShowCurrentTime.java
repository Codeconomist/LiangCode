/*
 * Demonstrates the use of the long datatype
 */
package liang8.Chapter2;

/**
 *
 * @author Rob
 */
public class ShowCurrentTime {
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = (int)(totalSeconds%60);
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours%24;
        
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
