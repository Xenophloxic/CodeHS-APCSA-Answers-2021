public class Dog 
{
    private String breed;
    public String name;
    
    public Dog(String theBreed, String dogName)
    {
        breed = theBreed;
        name = dogName;
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + breed;
    }
}