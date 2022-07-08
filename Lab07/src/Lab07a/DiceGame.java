package Lab07a;

/**
 * It will roll dices untill both dices values are 6.
 * @author Erkin Aydın
 * @version 17/12/2020
 */
public class DiceGame
{
    
    // Properties
    
    Dice myDice;
    
    //Constructor
    
    public DiceGame()
    {
        myDice = new Dice();
    }
    
    //Method
    /**
     * It will print the step number with the sum of current upper face values of dices
     * in a suitable format for the terminal.
     * @return the step number.
     */
     
    public int play()
    {
        int counter;
        
        counter = 0;
        
        do 
        {
            myDice.roll();
            counter++;
            System.out.println( "-------------------------------------------" );
            System.out.println( "This is step number " + counter );
            System.out.println( myDice );
            System.out.println( "-------------------------------------------" );
        } while ( !( myDice.getDiceTotal() == 12 ) );
        
        return counter;
        
    }
    

}
