package Lab07a;

/**
 * It will simply test whether Die.java works or not
 * @author Erkin Aydın
 * @version 17/12/2002
 */
public class TestDie 
{
    public static void main (String[] args ) 
    {
        Die die1 = new Die ();
        Die die2 = new Die ();
        
        System.out.println("First dice value is==>" + die1 );
        System.out.println( "Second dice value is==>" + die2 );
    }
}