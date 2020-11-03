import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /** The damage a ball deals to the level */
    private int damage = 1;
    
    public Ball()
    {
        
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Levels level = (Levels) getOneIntersectingObject(Levels.class);
        if (level != null) 
        {
            level.hit(damage);
        }
    }    
}
