public class WorkShift
{
    public static void main(String[] args)
    {
        // assign variables
        int totalHours = 20;
        int totalMinutes = 42;
        int totalSeconds = 16;
        // do some magic to get seconds
        totalMinutes += (totalHours * 60);
        totalSeconds += (totalMinutes * 60);
        // print it out
        System.out.println("Seconds " + totalSeconds);
    }
}