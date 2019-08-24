package liang8.Chapter11;

public class GeometricObject1
{
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject1()
    {
        dateCreated = new java.util.Date();
    }
    
    public GeometricObject1(String colour, boolean filled)
    {
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    public boolean isFilled()
    {
        return filled;
    }
    
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }
    
    public String toString()
    {
        return "created on " + dateCreated + "\ncolour: " + colour +
                " and filled: " + filled;
    }
}