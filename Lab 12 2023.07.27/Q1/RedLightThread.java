package com.mycompany.q1;

public class RedLightThread extends Thread
{
    private final int DURATION = 5000;
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Red Light");
                Thread.sleep(DURATION);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
