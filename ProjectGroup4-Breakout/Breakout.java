import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Default background. Levels will be superimposed over this.
 * 
 * @author Spencer Riggins, Liz Soprano, Jason Bura, Caleb Williams
 * @version v.01
 */
public class Breakout extends World
{

    /**
     * Constructor for objects of class Breakout.
     * 
     */
    public Breakout()
    {    
        // Create a new world with 1600x900 cells with a cell size of 1x1 pixels.
        super(800, 450, 1);
        setBackground(new GreenfootImage("Placeholder.png"));
        addObject(new Levels(), 0, 0);
        addObject(new Slider(), 400, 445);
        addObject(new Ball(), 0, 0);
        setPaintOrder(Slider.class, Ball.class, Levels.class);
    }
    
    public void act()
    {
    }
}
