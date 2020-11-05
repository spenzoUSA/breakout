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
    private double dx, dy;
    
    public Ball()
    {
        dx = 0;
        dy = -1;
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        bounce();
        moveAround();
        Levels level = (Levels) getOneIntersectingObject(Levels.class);
        if (level != null) 
        {
            level.hit(damage);
        }
    }
    
    /**
     * 
     */
    public void moveAround()
    {
        setLocation(getX() + (int)(2 * dx), getY() + (int)(2 * dy));
    }
    
    public void bounce()
    {
        if(isTouching(Slider.class))
        {
            dy *= -1;
        }
        else if(isTouching(Levels.class))
        {
            dy *= -1;
        }
        else if(getY() == 0)
        {
            dy *= -1;
        }
        else if(getX() == 0 || getX() == 808)
        {
            dx *= -1;
        }
    }
}
