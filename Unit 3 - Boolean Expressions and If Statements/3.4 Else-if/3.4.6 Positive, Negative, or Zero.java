import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // make scanner and ask for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("number:");
        int num = scanner.nextInt();
        // if/else
        if(num > 0) // positive
        {
            System.out.println("The number is positive!");
        }
        if(num < 0) // negative
        {
            System.out.println("The number is negative!");
        }
        else // zero
        {
            System.out.println("The number is neither positive nor negative!");
        }
    }
}