import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score?");
        int points = input.nextInt();
        
        System.out.println("How many rebounds did you get?");
        int rebounds = input.nextInt();
        
        System.out.println("How many assists did you have?");
        int assists = input.nextInt();
        
        // Create three boolean variables that
        // check if the stats are 10 or more
        boolean c1 = points >= 10;
        boolean c2 = rebounds >= 10;
        boolean c3 = assists >= 10;
        
        
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + c1);
        System.out.println("You got 10 or more rebounds: " + c2);
        System.out.println("You got 10 or more assists: " + c3);
        
    }
}
