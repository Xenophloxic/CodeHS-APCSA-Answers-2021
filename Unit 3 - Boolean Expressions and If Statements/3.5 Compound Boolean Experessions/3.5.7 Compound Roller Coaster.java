import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        // create scanner object
        Scanner input = new Scanner(System.in);    
        System.out.println("how tall are you");
        int inch = input.nextInt();
        System.out.println("how old are you");
        int age = input.nextInt();
        if(age >= 9 && inch >= 42) // check if true
        {
            System.out.println("Welcome aboard!"); 
        }
        else
        {
            System.out.println("Sorry, you are not eligible to ride"); // if not
        }
    }
}