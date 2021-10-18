import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Ask the user for the grams of sugar
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grams of sugar have you eaten today?");
        int sugar = scanner.nextInt();
        boolean sugar2 = sugar < 30;
        // Use a boolean expression to print if they can eat more sugar
        System.out.println("You can eat more sugar:" + sugar2);
    }
}
