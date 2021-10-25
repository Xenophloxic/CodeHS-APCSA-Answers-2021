public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    
    public Pizza(String pType, String pToppings, int pSize) {
       type = pType;
       toppings = pToppings;
       size = pSize;
    }
    
    
    
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}