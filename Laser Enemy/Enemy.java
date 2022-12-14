import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy (int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    public Enemy ()
    {
        setRotation(180);
    }
    public int speed = 10;
    public void act()
    {
        move(speed);
        if (isAtEdge())
            getWorld().removeObject(this);
        bulletWeapon();
    }
    int durationWeapon = 0;
    protected void bulletWeapon(){
        if (durationWeapon==20){
            getWorld().addObject(new LaserEnemy(), getX()+10, getY());
            durationWeapon = 0;
        }else{
            durationWeapon++;
        }
    }
}
