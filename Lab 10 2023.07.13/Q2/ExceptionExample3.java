package com.mycompany.exceptionexample3;
public class ExceptionExample3 
{
    public static void main(String[] args)
    {
        int[]numbers = {11,21,31,41,51};
        try
        {
            int x = 10;
            int y = numbers[x];
            System.out.println("Value of index "+x+":"+y);
        }
        catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Invalid Index");  
                }
        finally
        {
            for(int i=0;i<numbers.length;i++)
            {
                System.out.println(numbers[i]);
            }
        }
    }
}
