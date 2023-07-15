package com.mycompany.q4;
public class JumpingPlayer extends Player
{
    public void moveUp()
    {
        System.out.println("Player moved up");
    }
    
    public void moveDown()
    {
        System.out.println("Player move down");
    }
    
    public void moveLeft()
    {
        System.out.println("Player moved left");
    }
    
    public void moveRight()
    {
        System.out.println("Player move right");
    }
    
    public void crouch()
    {
        System.out.println("Player crouched");
    }
    
    public void moveCrouched()
    {
        System.out.println("Player moved crouched by 2 spaces");
    }
    
}
