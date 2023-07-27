package com.mycompany.q1;
public class GreenLightThread extends Thread
{
    private final int DURATION = 10000;
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Green Light");
                Thread.sleep(DURATION);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
