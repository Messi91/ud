package modelpackage;

/**
 *
 * @author mesfinmebrate
 */

public class Die 
{
    private int numberOfSides;
    private int numberRolled;
    
    public Die()
    {
        this.numberOfSides = 6;
    }
    public Die(int sides)
    {
        this.numberOfSides = sides;
    }
    
    public int getNumberOfSides()
    {
        return numberOfSides;
    }
    public int getNumberRolled()
    {
        return numberRolled;
    }
    
    public void roll()
    {
        this.numberRolled = (int) (Math.random()*(this.getNumberOfSides()))+1;
    }
}
