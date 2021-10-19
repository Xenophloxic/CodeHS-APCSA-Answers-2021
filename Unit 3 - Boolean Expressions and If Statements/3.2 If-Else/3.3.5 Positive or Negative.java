import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Make scanner object and ask for input
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number:");
        int number = scanner.nextInt();
        
        // tell if number is positive or negative
        
        if(number >= 0)
        {
            System.out.println("The number is positive!");
        }
        else
        {
            System.out.println("The number is negative!");
        }
    }
}
