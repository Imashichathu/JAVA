package com.mycompany.q1;
public class YellowLightThread extends Thread
{
    private final int DURATION = 2000;
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Yellow Light");
                Thread.sleep(DURATION);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
