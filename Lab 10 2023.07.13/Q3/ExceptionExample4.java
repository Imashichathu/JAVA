package com.mycompany.exceptionexample4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample4 
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("C:\\Users\\Imashi Gunarathna\\OneDrive");
            Scanner s = new Scanner(f);
            while(s.hasNextLine())
            {
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}
