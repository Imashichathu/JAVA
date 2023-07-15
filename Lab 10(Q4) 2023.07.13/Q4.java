package com.mycompany.q4;
public class Q4
{
    public static void main(String[] args)
    {
        RegularPlayer r = new  RegularPlayer();
        OppositePlayer o = new OppositePlayer();
        JumpingPlayer j = new JumpingPlayer();
        
        r.moveUp();
        r.moveDown();
        r.moveLeft();
        r.moveRight();
        
        o.moveUp();
        o.moveDown();
        o.moveLeft();
        o.moveRight();
        
        j.moveUp();
        j.moveDown();
        j.moveLeft();
        j.moveRight();
        
        j.crouch();
        j.moveCrouched();
             
    }
}
