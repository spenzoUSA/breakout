import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slider extends Actor
{
    /**
     * Act - do whatever the Slider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Slider()
    {
        setImage("Slider.png");
        act();
    }
    
    public void act() 
    {
        handleKeyPress();// Add your action code here.
    }
    
    public void handleKeyPress()
    {
        checkLeftArrow();
        checkRightArrow();
    }
    
    public void checkLeftArrow()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
    }
    
    public void checkRightArrow()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
    }
}
