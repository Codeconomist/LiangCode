package liang8.Chapter02;

/*
 *  This class is also written up as ShowCurrentTime.java
 */
public class Ch02Review15
{
    public static void main(String[] args)
    {
        long s = System.currentTimeMillis();
        long totalSeconds = s / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
