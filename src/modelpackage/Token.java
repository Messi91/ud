package modelpackage;

/**
 *
 * @author mesfinmebrate
 */
public class Token 
{
    private String name;
    private int position;
    private int hLimit;
    private int vLimit;
    
    public Token(int horizontal, int vertical)
    {
        this.name = "";
        position = 0;
        hLimit = horizontal;
        vLimit = vertical;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getPosition()
    {
        return position;
    }
    
    public void move(int n)
    {
        position = n;
    }
    
    public String toString()
    {
        return name;
    }
}
