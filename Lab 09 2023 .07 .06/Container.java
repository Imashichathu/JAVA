package com.mycompany.cylindricalcontainer;
public abstract class Container
{
    private double height , radius;
    public abstract double getVolume();

    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getRadius() 
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }   
}
