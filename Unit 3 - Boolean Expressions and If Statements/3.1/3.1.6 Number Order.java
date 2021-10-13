import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // make scanner object
        // Ask for two numbers
        System.out.println("Enter two numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        // Compare the numbers as instructed
        boolean less = n1 < n2;
        boolean equal = n1 == n2;
        boolean greater = n1 > n2;
        // Display the results
        System.out.println(n1 + " < " + n2 + ": " + less);
        System.out.println(n1 + " == " + n2 + ": " + equal);
        System.out.println(n1 + " > " + n2 + ": " + greater);
    }
}
