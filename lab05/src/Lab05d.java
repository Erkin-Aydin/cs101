import java.util.Scanner;
import java.util.Locale;

/**
 * __ Lab05d exercise: It will report pi by using three different methods.
 * @author Erkin Aydın
 * @version 26/11/2020
 */


public class Lab05d
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        scan.useLocale ( Locale.US );
        
        System.out.println( "Welcome to Pi Reporter!" );
        
        // Constants
        
        final String LINE = "----------------------------------------";
        
        // Variables
        
        double firstPartPiValue;
        int secondPartStepNumber;
        int secontPartStepCounter;
        double secondPartPiValue;
        int a;
        double thirdPartPiValue;
        int thirdPartPiCounter;
        double error;
        
        // First part of Lab05d. We will use Math.PI to report pi.
        
        System.out.println( "First Part: " );
        System.out.println( LINE );
        firstPartPiValue = Math.PI;
        System.out.println( firstPartPiValue );
        System.out.println( LINE );
        System.out.println( "First Part Done!" );
        System.out.println();
        
        /* Second part of Lab05d. We will use secondPartStepNumber as the number of
        values ve are going to compute the value of pi.*/
        
        System.out.println( "Second Part: " );
        System.out.println( LINE );
        System.out.print( "What is the step number: " );
        secondPartStepNumber = scan.nextInt();
        
        if ( secondPartStepNumber <= 0 )
        {
            System.out.println( "Such step number can not exist!" );
        }
        else
        {
            // We initialize necessary variables to 0.
            secondPartPiValue = 0.0;
            secontPartStepCounter = 0;
            // We use secondPartStepNumber to determine how many times we are going to do calculations.
            for ( a = 0; a < secondPartStepNumber; a++ )
            {
                secontPartStepCounter++;
                
                // Here we determine whether secontPartStepCounter is even or odd, and act according to it.
                if ( secontPartStepCounter % 2 == 1 )
                {
                    secondPartPiValue = secondPartPiValue + 4 / (double)( 2 * secontPartStepCounter - 1 );
                }
                else
                {
                    secondPartPiValue = secondPartPiValue - 4 / (double)( 2 * secontPartStepCounter - 1 );
                }
            }
            System.out.println( secondPartPiValue );
        }
        System.out.println( LINE );
        System.out.println( "Second Part Done!" );
        System.out.println();
        
        // Third part of Lab05d
        
        System.out.println( "Third Part: " );
        System.out.println( LINE );
        System.out.print( "What will the error percentage be: " );
        error = scan.nextDouble();
        
        // We initialize necessary variables to 0.
        thirdPartPiValue = 0.0;
        thirdPartPiCounter = 0;
        do {
                thirdPartPiCounter++;
                
                // We determine whether thirdPartPiCounter is even or odd, and act according to it.
                if ( thirdPartPiCounter % 2 == 1 )
                {
                    thirdPartPiValue = thirdPartPiValue + 4 / (double)( 2 * thirdPartPiCounter - 1 );
                }
                else
                {
                    thirdPartPiValue = thirdPartPiValue - 4 / (double)( 2 * thirdPartPiCounter - 1 );
                }
                
        } while ( !( Math.abs(thirdPartPiValue - Math.PI) <= error ) );
        /* If the value calculated is indeed close enough to real pi value, we report it. Otherwise,
        the program will continue calculations. */
        System.out.println( thirdPartPiValue + " close enough!" );
        System.out.println( LINE );
        System.out.println( "Third Part Done!" );
        
        scan.close();
    }
}
