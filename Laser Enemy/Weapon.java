import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        weaponSet();
    }
    int weaponDuration = 0;
    protected void weaponSet()
    {
        if(isTouching(Enemy.class)){
            getWorld().addObject(new Bang(), getX(), getY());
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
            weaponDuration++;
        }
    }
}
