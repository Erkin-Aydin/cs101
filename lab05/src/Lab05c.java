import java.util.Scanner;
import java.util.Locale;

/**
 * __Lab05c: A simple calculator program with a user menu.
 * @author Erkin Aydın
 * @version 26/11/2020
 */

 public class Lab05c
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        scan.useLocale ( Locale.US );
        
        // Constants
        
        final String LINE = "-------------------------------";
        
        // Variables
        String outputString;
        String inputString;
        double outputVariable;
        double solidValue;
        String operator;
        // If startAgain is 1, that means user wants to clear the previous work.
        int startAgain;
        //If outOfProgram is one, that means user wants to quit the program.
        int outOfProgram;
        int length;
        
        System.out.println( "Welcome to Simple Calculator!" );
        
        /* We want to print the menu et least once, so using do-while
        would be efficient. The program should continue creating updated
        user menus unless user prints 'q', 'Q', or any combination of "Quit". */
        do
        {
            outputVariable = 0.0;
            
            /* If the user enters 'c', 'C', or any combination of "Clear",
            the user menu will reser itself. If not, it will continue calculating new values. */
            do
            {
                outputString = "[ " + outputVariable + " ]";
                
                // This is the user menu and where we get input.
                System.out.println(LINE);
                System.out.println( outputString );
                System.out.println(LINE);
                System.out.println( "  +,-,*,/ value" );
                System.out.println( "  Clear" );
                System.out.println( "  Quit" );
                System.out.println(LINE);
                System.out.print( "Select: " );
                inputString = scan.nextLine();
                
                /* If the user wants to clear his/her/their previous calculations, then entering 
                'c', 'C', or any combination of "Clear" would be enough. */
                if ( inputString.equalsIgnoreCase( "C" ) || inputString.equalsIgnoreCase( "Clear" ) )
                {
                    startAgain = 1;
                    outOfProgram = -1;
                }
                
                /* If the user wants to quit the progtam, then entering 'q', 'Q', or any combination
                 of "Quit" would be enough. */
                else if ( inputString.equalsIgnoreCase( "Q" ) || inputString.equalsIgnoreCase( "Quit" ) )
                {
                    startAgain = 1;
                    outOfProgram = 1;
                }
                else
                {
                    startAgain = -1;
                    outOfProgram = -1;
                    
                    length = inputString.length();
                    operator = inputString.substring( 0, 1);
                    solidValue = Double.valueOf( inputString.substring( 2, length ) );
                    System.err.println(inputString);
                    
                    // This is the part we check the operator and act according to it.
                    if ( operator.equals( "+" ) )
                    {
                        outputVariable = outputVariable + solidValue;
                    }
                    else if ( operator.equals( "-" ) )
                    {
                        outputVariable = outputVariable - solidValue;
                    }
                    else if ( operator.equals( "*" ) )
                    {
                        outputVariable = outputVariable * solidValue;
                    }
                    else if ( operator.equals( "/") )
                    {
                        outputVariable = outputVariable / solidValue;
                    }
                    
                }
                
            } while ( startAgain < 0);
            
        } while ( outOfProgram < 0 );
        
        scan.close();
    }
}
