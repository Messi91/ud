package modelpackage;

/**
 *
 * @author mesfinmebrate
 */
public class Board 
{
    private int width;
    private int height;
    private Token player1;
    private Token player2;
    
    public Board()
    {
        width = 100;
        height = 100;
        player1 = new Token(width, height);
        player2 = new Token(width, height);
    }
    
    public Board(int size)
    {
        width = size;
        height = size;
        player1 = new Token(width, height);
        player2 = new Token(width, height);
    }
    
    public Board(int width, int height)
    {
        this.width = width;
        this.height = height;
        player1 = new Token(width, height);
        player2 = new Token(width, height);
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public Token getPlayer1()
    {
        return player1;
    }
    
    public Token getPlayer2()
    {
        return player2;
    }
    
    public void setNames(String name1, String name2)
    {
        player1.setName(name1);
        player2.setName(name2);
    }
    
    public void movePlayer1(int n)
    {
        player1.move(n);
    }
    
    public void movePlayer2(int n)
    {
        player2.move(n);
    }
}
