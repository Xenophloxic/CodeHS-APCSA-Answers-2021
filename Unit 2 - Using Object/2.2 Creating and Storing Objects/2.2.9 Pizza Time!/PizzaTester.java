public class PizzaTester 
{
    public static void main(String[] args)
    {
        Pizza one = new Pizza("Onions", "Beef", 15);
        Pizza two = new Pizza("Cheese", "Cheese", 22);
        Pizza three = new Pizza("Meat", "Pepperoni", 12);
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}