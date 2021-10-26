public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return color + " circle with a radius of " + radius + " at position (" + x + ", " + y + ")";
    }
    
    public boolean equals(Circle other)
    {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Circle)) {
            return false;
        }
        Circle cir = (Circle) other;
        return color.equals(cir.color) && radius == cir.radius && x == cir.x && y == cir.y;
    }
}