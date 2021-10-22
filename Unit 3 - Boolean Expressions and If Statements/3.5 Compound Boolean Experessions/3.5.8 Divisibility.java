import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the dividend: "); // ask for stuff
        int dividend = input.nextInt();
        
        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();
        
        if(divisor == 0 || dividend % divisor != 0) // do checks and print
        {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
            
        } else {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
    }
}