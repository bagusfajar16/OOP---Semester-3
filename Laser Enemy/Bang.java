import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bang extends Actor
{
    /**
     * Act - do whatever the Bang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        bangDisappear();
    }
    int bangDuration = 0;
    public void bangDisappear()
    {
        if (bangDuration==10){
            getWorld().removeObject(this);
        } else {
            bangDuration++;
        }
    }
}
