package Lab07a;

/**
 * This class has methods to roll a dice, get the current face value of the dice and
 * convert this result into a string.
 * @author Erkin Aydın
 * @version 17/12/2020
 */
public class Die
{
    // Property

    private int currentFaceValue;
    
    // Constructors
    
    public Die ()
    {
        roll();
    }
    
    // Methods
    /**
     * It will create a random value between 1 and 6 for the face value of the dice.
     * @return the current face value of the dice.
     */
    
    public int roll ()
    {
        currentFaceValue = (int)( 6 * Math.random() + 1 ); 
        return currentFaceValue;
    }
    /**
     * It will get the current face value of the dice.
     * @return the current face value of the dice. 
     */
    
    public int getFaceValue ()
    {
        return currentFaceValue;
    }
    
    /**
     * It will convert the int current face value to string.
     * @return the string version of the current face value of the dice
     */
    public String toString ()
    {
        String result = Integer.toString( currentFaceValue );
        return result;
    }
}