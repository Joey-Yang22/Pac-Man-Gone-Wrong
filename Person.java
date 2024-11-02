import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
            if(isTouching(Pillars.class) || isTouching(smallPillars.class) || isTouching(SmallVert.class))
            {
                setLocation(getX(),getY()+1);
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+1);
             if(isTouching(Pillars.class) || isTouching(smallPillars.class) || isTouching(SmallVert.class))
            {
                setLocation(getX(),getY()-1);
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1,getY());
            if(isTouching(Pillars.class) || isTouching(smallPillars.class) || isTouching(SmallVert.class))
            {
                setLocation(getX()+1,getY());
            }
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1,getY());
            if(isTouching(Pillars.class) || isTouching(smallPillars.class) || isTouching(SmallVert.class))
            {
                setLocation(getX()-1,getY());;
            }
        }
        if(isTouching(Balls.class))
        {
            removeTouching(Balls.class);
        }
        if(isTouching(Pillars.class))
        {
            move(-2);
        }
        if(isTouching(smallPillars.class))
        {
            move(-2);
        }
    }    
}
