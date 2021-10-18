import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for drink
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        // Ask for sugar
        System.out.println("How many teaspoons of sugar do you want?");
        int sugar = input.nextInt();
        // print
        System.out.println("Confirming your order. You wanted:");
        // check for 0
        if(sugar == 0)
        {
            // print with 0
           System.out.println(drink);
        }
        //if not zero
        if(sugar != 0)
        {
            System.out.println(drink + " with sugar");
        }
    }
}