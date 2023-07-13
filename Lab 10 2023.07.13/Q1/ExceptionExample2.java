package com.mycompany.exceptionexample2;
import java.util.Scanner;
public class ExceptionExample2
{
    public static void main(String[] args)
    {
        int x , y , z ;
        
        Scanner c =new Scanner(System.in);
        
        System.out.println("Enter a number for x");
        x =c.nextInt();
        System.out.println("Enter a number for y");
        y =c.nextInt();
        
        try
        {
            z = (x/y);
            System.out.println("Z is "+z);
        }
        catch(ArithmeticException e)
                {
                    System.out.println("Error : divided by zero is not allowed");
                }       
    }
  }
