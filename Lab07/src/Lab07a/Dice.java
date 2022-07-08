package Lab07a;

/**
 * It can:
 * 1) roll two dices and return the sum of their upper face values
 * 2) return the current upper face values of both dices
 * 3) return the sum of their upper face values
 * 4) return the preferred string presentation of both dices upper face values.
 * @author Erkin Aydın
 * @version 17/12/2020
 */

 public class Dice 
{
    // Properties

    Die die1; 
    Die die2; 
    
    // Constructors
    public Dice ()
    {
        die1 = new Die ();
        die2 = new Die ();
    }
    
    // Methods
    
    /**
     * It will roll two dices and returns the sum of their upper face values.
     * @return sum of the upper face values of the dices.
     */
    
    public int roll()
    {
        die1.roll();
        die2.roll();
        return getDiceTotal();
    }
    
    /**
     * It will return the upper face value of the first dice.
     * @return upper face value of the first dice.
     */
    
    public int getDie1FaceValue()
    {
        return die1.getFaceValue();
    }
    
    /**
     * It will return the upper face value of the second dice.
     * @return upper face value of the second dice.
     */
    
    public int getDie2FaceValue()
    {
        return die2.getFaceValue();
    }
    
    /**
     * It will return the sum of the upper face values of the dices.
     * @return sum of the upper face values of the dices.
     */
    
    public int getDiceTotal()
    {
        return getDie1FaceValue() + getDie2FaceValue();
    }
    
    /**
     * It will return the preferred string presentation of both dices upper face values.
     * @return upper face values of the dices in a suitable format.
     */
    
    public String toString()
    {
       
       return "[" + die1.toString() + ", " + die2.toString() + "]" ;
    }
}