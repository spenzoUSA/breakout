import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends Actor
{
    /** When the strength of the level goes down to zero, it will be removed */
    private int strength = 5;
    
    
    public Levels()
    {
        //setImage("LevelsRed.png");
    }
    
    /**
     * Act - do whatever the Levels wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Returns the strength of the level.
     */
    public int getStrength()
    {
        return strength;
    }
    
    /**
     * If the level is hit with the ball, it's strength goes down and the color changes.
     */
    public void hit(int damage)
    {
        strength = strength - damage;
        if (strength == 4)
        {
            setImage("LevelsOrange.png");
        }
        else if (strength == 3)
        {
            setImage("LevelsYellow.png");
        }
        else if (strength == 2) 
        {
            setImage("LevelsGreen.png");
        }
        else if (strength == 1) 
        {
            setImage("LevelsBlue.png");
        }
        else if (strength < 1) 
        {
            getWorld().removeObject(this);
        }
    }
}
