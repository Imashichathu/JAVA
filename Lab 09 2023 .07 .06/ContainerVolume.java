package com.mycompany.cylindricalcontainer;
public class ContainerVolume extends Container
{
    public double getVolume()
    {
        return Math.PI * getRadius()* getRadius()* getHeight();
    }
}
