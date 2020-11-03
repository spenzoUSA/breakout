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
        super(808, 450, 1);
        setBackground(new GreenfootImage("Placeholder.png"));
        addObject(new Levels(), 40, 10);
        addObject(new Levels(), 121, 10);
        addObject(new Levels(), 202, 10);
        addObject(new Levels(), 283, 10);
        addObject(new Levels(), 364, 10);
        addObject(new Levels(), 445, 10);
        addObject(new Levels(), 526, 10);
        addObject(new Levels(), 607, 10);
        addObject(new Levels(), 688, 10);
        addObject(new Levels(), 769, 10);
        addObject(new Slider(), 404, 445);
        addObject(new Ball(), 0, 0);
        setPaintOrder(Slider.class, Ball.class, Levels.class);
    }

    public void act()
    {
    }
}
