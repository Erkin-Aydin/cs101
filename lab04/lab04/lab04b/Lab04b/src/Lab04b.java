/**
 * Lab04
 * @author Erkin Aydın
 * @version 9/11/2020
 */

import java.util.Scanner;

public class Lab04b {
    public static void main( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        
        //  Constants
        
        // Variables
        
        char ch1;
        char ch2;
        char ch3;
        int width1;
        int width2;
        int width3;
        int x1;
        int x2;
        int x3;
        int printWidth1;
        int printWidth2;
        
        /* Task 1: Prompt the user to enter a character, 
        ch, and an int value, width, and then print out a triangle formed
         using ch characters having a base of width characters. For example, if 
         the user enters "*" and 5, it should print, */
        
        System.out.println( "Task 1 starts..." );
        System.out.print ( "Please enter a character: " );
        ch1 = scan.next().charAt( 0 );
        
        System.out.print ( "Please enter a positive integer as width: " );
        width1 = scan.nextInt();
        if ( width1 <= 0 )
        {
            System.out.println ( "Invalid width value entered" );
        }
        else
        {
            x1 = 1;
            printWidth1 = 1;
            while ( x1 <= width1 )
            {
                while ( printWidth1 <= x1 )
                {
                    System.out.print( ch1 );
                    printWidth1 = printWidth1 + 1;
                }
                System.out.println( "" );
                printWidth1 = 1;
                x1 = x1 + 1;
            }
        }
        System.out.println( "Task 1 done!" );
        System.out.println( "" );
        
        /* Task 2: Prompt the user to enter a character, ch, and an int value, 
        width, and then print out a triangle formed using ch characters having a 
        "base" of width characters. For example, if the user enters "-" and 4, it should print, */
        
        System.out.println( "Task 2 starts..." );
        System.out.print( "Please enter a character: " );
        ch2 = scan.next().charAt( 0 );
        System.out.print( "Please enter a positive integer value as width: " );
        width2 = scan.nextInt();
        if ( width2 <= 0 )
        {
            System.out.println( "Invalid width value entered." );
        }
        else
        {
            x2 = width2;
            printWidth2 = width2;
            while ( 0 < printWidth2 )
            {    
                while ( 0 < x2 )
                {
                    System.out.print( ch2 );
                    x2 = x2 - 1;
                }
                System.out.println( "" );
                printWidth2 = printWidth2 - 1;
                x2 = printWidth2;
            }    
        }
        System.out.println( "Task 2 done!" );
        System.out.println( "" );
        
        // Another way to do Task 2.
        
        System.out.println( "Task 2 starts..." );
        System.out.print( "Please enter a character: " );
        ch3 = scan.next().charAt( 0 );
        System.out.print( "Please enter a positive integer value as width: " );
        width3 = scan.nextInt();
        if ( width3 <= 0 )
        {
            System.out.println( "Invalid width value entered." );
        }
        else
        {
            x3 = width3;
            while ( 0 < width3 )
            {
                while ( 0 < x3 )
                {
                    System.out.print( ch3 );
                    x3 = x3 - 1;
                }
                System.out.println( "" );
                width3 = width3 - 1;
                x3 = width3;
            }
        }
        System.out.println( "Task 2 done!" );
        System.out.println( "" );
        
        scan.close();
    }
}
