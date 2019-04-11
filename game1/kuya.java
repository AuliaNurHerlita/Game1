import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kuya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kuya extends Actor
{
    /**
     * Act - do whatever the kuya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            turn(-2);
        }
        if(Greenfoot.isKeyDown("right")) {
            turn(2);
        }
            if(Greenfoot.isKeyDown("up")) {
            move(2);
        }
        if(Greenfoot.isKeyDown("down")) {
            move(-1);
        }
        Actor banana = getOneObjectAtOffset(0,0, banana.class);
        if(banana != null) {
        getWorld().removeObject(banana);
        score.banana++;
    }
    if(score.banana == 5) {
        getWorld().addObject(new menang(), 300, 200);
        Greenfoot.stop();
    }
        }
    }    

