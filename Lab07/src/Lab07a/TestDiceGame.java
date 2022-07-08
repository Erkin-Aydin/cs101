package Lab07a;

/**
 * It will play the dice game and then print the step number where 
 * both dice values were 6.
 * @author Erkin Aydın
 * @version 17/12/2020
 */

public class TestDiceGame 
{
    public static void main( String[] args) {

        // Variables
        DiceGame a;
        
        // Program code
        a = new DiceGame();
        System.out.println( );
        System.out.println( "In step " + a.play() + ", there are two 6's" );
    }
}