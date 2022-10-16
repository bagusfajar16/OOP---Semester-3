import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
            setLocation(getX()-7,getY());
        if(Greenfoot.isKeyDown("s"))
            setLocation(getX(),getY()+7);
        if(Greenfoot.isKeyDown("d"))
            setLocation(getX()+7,getY());
        if(Greenfoot.isKeyDown("w"))
            setLocation(getX(),getY()-7);
        
        bulletWeapon();
        
        if(getX()==599){
            setLocation(0, getY());
        } else if (getY()==399) {
            setLocation(getX(), 0);
        } else if (getY()==0) {
            setLocation(getX(), 399);
        }
        
        if (isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            setLocation(61, 205);
            //getWorld().removeObject(this);
            //getWorld().addObject(new Hero(), 61, 205);
        }
    
    }
    int durationWeapon = 0;
    public void bulletWeapon(){
        if (durationWeapon==20){
            getWorld().addObject(new Weapon(), getX()+10, getY());
            durationWeapon = 0;
        }else{
            durationWeapon++;
        }
    }
}
