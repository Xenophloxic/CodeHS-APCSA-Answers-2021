public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       // between 0 and 60
       int random = (int)Math.floor(Math.random()*(60 - 0+1) + 0);
       
       // Print the number of seconds
       System.out.println("Microwaving for " + random + " seconds");
       
       // Use two if statements to print
       // whether the roll is fine or will catch fire
       if(random <= 20)
       {
           System.out.println("Perfect cooking time!");
       }
       if(random > 20)
       {
           System.out.print("Your roll will catch fire!");
       }
    }
}
