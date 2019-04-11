import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        addObject(new kuya (),20,200);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        banana banana = new banana();
        addObject(new banana (),312,101);
        removeObject(banana);
        banana banana2 = new banana();
        addObject(new  banana (),318,274);
        removeObject(banana2);
        banana banana3 = new banana();
        addObject(new banana (),452,186);
        removeObject(banana3);

        bola bola = new bola();
        addObject(new bola(),134,89);
        removeObject(bola);
        

        score score = new score();
        addObject(new score(),41,31);

       
    }
}
