import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GhostA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GhostA extends Actor
{
    private int bottomOfScreen;
    private int rightSideOfScreen;
    
    public void addedToWorld(World MyWorld)
    {
        rightSideOfScreen = MyWorld.getWidth() - 1;
        bottomOfScreen = MyWorld.getHeight() - 1;
    }
    /**
     * Act - do whatever the GhostA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
 
public void act()
{
        move(1);
        if(Greenfoot.getRandomNumber(20) == 1)
        {
            setRotation(Greenfoot.getRandomNumber(360));
            
            int x = getX();
            int y = getY();
            
            if(x <= 0 || y <= 0 || x >= rightSideOfScreen || y >= bottomOfScreen)
            {
                turn(180);
            }
        }
        if(isTouching(Person.class))
        {
            removeTouching(Person.class);
        }
}
    

}
