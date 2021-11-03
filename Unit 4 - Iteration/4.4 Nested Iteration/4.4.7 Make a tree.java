public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        int i, j, k, spacer = 10;
        
        for(i = 1; i < 10; i++)
        
        {
        
        for(k = 0; k < spacer; k++)
        
        {
        
        System.out.print(" ");
        
        }
        
        for(j = 0; j < i; j++)
        
        {
        
        System.out.print("* ");
        
        }
        
        System.out.println();
        
        spacer--;
  }
    }
    }
