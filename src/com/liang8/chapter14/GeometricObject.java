package com.liang8.chapter14;

public abstract class GeometricObject {
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject (String colour, boolean filled)
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
        return "created on " + dateCreated + "\ncolour: " + colour + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}