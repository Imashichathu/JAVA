package com.mycompany.cylindricalcontainer;
public class CylindricalContainer 
{
    public static void main(String[] args)
    {
        ContainerVolume v = new ContainerVolume();
        v.setRadius(7);
        v.setHeight(20);
        double volume = v.getVolume();
        System.out.println("Volume is "+volume);
    }
}
