package com.liang8.chapter14;

public class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle()
    {
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String colour, boolean filled)
    {
        this.width = width;
        this.height = height;
        setColour(colour);
        setFilled(filled);
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }
}
