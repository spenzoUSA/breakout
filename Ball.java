import java.util.Arrays;
import java.util.ArrayList;
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
    private int rotation = 0;

    private double dx, dy;
    
    public Ball()
    {
        setRotation(75);
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        moveAround();
        bounce();
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
        move(2);
        //setLocation(getX() + (int)(2 * dx), getY() + (int)(2 * dy));
    }
    
    //Working on horizontal movement, still not working as it should
    public void bounce()
    {
        if(isTouching(Slider.class))
        {
            if(getX() < getWorld().getObjects(Slider.class).get(0).getX())
            {
                if(getRotation() > 270)
                {
                    setRotation(getRotation() - 180
                        + (getWorld().getObjects(Slider.class).get(0).getX() - getX())/10);
                }
                else
                {
                    setRotation(360 - getRotation() + (getX()
                        - getWorld().getObjects(Slider.class).get(0).getX())/10);
                }
            }
            else
            {
                if(getRotation() < 270)
                {
                    setRotation(getRotation() - 180
                        + (getWorld().getObjects(Slider.class).get(0).getX() - getX())/10);
                }
                else
                {
                    setRotation(360 - getRotation() + (getX()
                        - getWorld().getObjects(Slider.class).get(0).getX())/10);
                }
            }
        }
        else if(isTouching(Levels.class) || getY() == 0)
        {
            if(getRotation() < 90)
            {
                setRotation(180 + getRotation());
            }
            else if(getRotation() > 90)
            {
                setRotation(360 - getRotation());
            }
        }
        else if(getX() <= 0)
        {
            if(getRotation() > 180)
            {
                setRotation(540 - getRotation());
            }
            else if(getRotation() < 180)
            {
                setRotation(180 - getRotation());
            }
        }
        else if(getX() >= 800)
        {
            if(getRotation() > 270)
            {
                setRotation(540 - getRotation());
            }
            else if(getRotation() < 90)
            {
                setRotation(180 - getRotation());
            }
        }
    }
}
