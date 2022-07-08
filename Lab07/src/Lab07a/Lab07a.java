package Lab07a;

import java.util.Scanner;

/**
 * Lab07 Exercise 1: It will two random values for dices, it will continue 
 * doing this until both values are 6.
 * Lab07 Exercise 2: Slightly modified version of the first exercise. It will do 
 * the same thing, but for more players. It will stop when one of the players roll
 * two 6's.
 * @author Erkin Aydın
 * @version 17/12/2020
 */ 
public class Lab07a
{
   public static void main( String[] args)
   {
        Scanner scan = new Scanner( System.in);
    
        // constants
        
        //Just to make our terminal look a bit more elegant.
        final String LINE = "<====================================================================>"; 
        
        // variables
      
        // Old Way variables exercise 1
        int dice1Exercise1;
        int dice2Exercise1;
        int tryNumber;
        
        // Old Way variables exercise 2
        int playerNumberExercise2;
        int stepNumberExercise2;
        int currentPlayerNumberExercise2;
        int checkNumberExercise2;
        int dice1Exercise2;
        int dice2Exercise2;
        
        // program code
        System.out.println( LINE );
        System.out.println( LINE );
        // Exercise 1:
        System.out.println( "Excercise 1 begins" );
        System.out.println( LINE );
        tryNumber = 0;
        
        /*This loop will stop when both dice values are 6, 
        otherwise, it will continue calculations */
        do 
        {
            // Here, we randomly initialize dice values between 1 and 6.
            dice1Exercise1 = (int)( 6 * Math.random() + 1 );
            dice2Exercise1 = (int)( 6 * Math.random() + 1 );
            
            // This will count how many times we tried.
            tryNumber++;
            
            System.out.println( LINE );
            
            /* Here, we simply print values of the two dice values we 
            previously initialized with how mant times we tried */
            System.out.println( "This is step number " +  tryNumber );
            System.out.println( "The first dice is " + dice1Exercise1 );
            System.out.println( "The second dice is " + dice2Exercise1 );
            
        } while ( !( ( Math.round( dice1Exercise1 ) == 6 ) && ( Math.round( dice2Exercise1 ) == 6 ) ) );
        
        System.out.println( "In step number " + tryNumber + " both dices are 6");
        System.out.println( LINE );
        System.out.println( "Exercise 1 is done!!!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        // Exercise 2:
        /* This is just one of the possible games that can be created by modifying our previous code.
        What it does is simple. In each round, every player will roll their dices once one by one. When every
        player rolls in the round, next round starts. They will continue rolling their dices until one 
        of them rolls two 6's. */
        
        System.out.println( "Exercise 2 Begins!!!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        // We simply take player number as an input.
        System.out.print( "How many individual will play: " );
        playerNumberExercise2 = scan.nextInt();
        
        // Here, we initialized necessary values.
        stepNumberExercise2 = 0;
        currentPlayerNumberExercise2 = 0;
        
        /* Firstly, this loop will print the round number the players are currently playing.
        Secondly, it will create random values for the current players dices, and if one the
        dices value equals to 6, it will consider the half of the task done, and will continue 
        rolling the dices until both dices values are equal to 6. It will also print every round.*/
        do
        {
            System.out.println( LINE );
            currentPlayerNumberExercise2++;
            checkNumberExercise2 = 0;
            if ( currentPlayerNumberExercise2 == playerNumberExercise2 + 1 )
            {
                currentPlayerNumberExercise2 = 1;
                stepNumberExercise2++;
                System.out.println("Step number ==> " + stepNumberExercise2 );
            }
            dice1Exercise2 = (int)( 6 * Math.random() + 1 );
            dice2Exercise2 = (int)( 6 * Math.random() + 1 );
            
            // We check whether the value equals to 6.
            if ( dice1Exercise2 == 6 )
            {
                checkNumberExercise2++;
            }
            
            // We check whether the value equals to 6.
            if ( dice2Exercise2 == 6 )
            {
                checkNumberExercise2++;
            }
            
            // We print dice values and round number.
            System.out.println("Player " + currentPlayerNumberExercise2 );
            System.out.println("First dice value is ==> " + dice1Exercise2 );
            System.out.println( "Second dice value is ==>" + dice2Exercise2 );
            System.out.println( LINE );
            
        } while ( ( currentPlayerNumberExercise2 <= playerNumberExercise2 ) && checkNumberExercise2 != 2 );
        
        // We print which player won the game.
        System.out.println( currentPlayerNumberExercise2 + "'th player won!" );
        System.out.println( LINE );
        System.out.println( "Exercise 2 is done!!!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        scan.close();
   }
   
}