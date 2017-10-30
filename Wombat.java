import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Wombat. A Wombat moves forward until it hits the edge of the world, at
 * which point it turns left. If a wombat finds a leaf, it eats it.
 * 
 * @author Michael Kölling
 * @version 2.0
 */
public class Wombat extends Actor
{
    private int leavesEaten;

    public Wombat()
    {
        leavesEaten = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if( Greenfoot.getRandomNumber(300) < 5 )
        {
            turnLeft();
        }
    }

    /**
     * Move one step forward.
     */
    private void move()
    {
        move(1);
    }

    /**
     * Turn left by 90 degrees.
     */
    private void turnLeft()
    {
        turn(-90);
    }

    /**
     * Set the direction we're facing. The 'direction' parameter must
     * be in the range [0..3].
     */
    private void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) 
        {
            setRotation(direction * 90);
        }
    }

    /**
     * Tell how many leaves we have eaten.
     */
    private int getLeavesEaten()
    {
        return leavesEaten;
    }
}
