package com.mycompany.q1;
public class Q1
{
    public static void main(String[] args) 
    {
        RedLightThread r = new RedLightThread();
        GreenLightThread g = new GreenLightThread();
        YellowLightThread y = new YellowLightThread();
        
        r.start();
        g.start();
        y.start();
    }
}
