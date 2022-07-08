import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;

/**
 * __Lab04f1: First part of Lab04f. This program will create a file which contains 
 * random integer values on the interval [ 0 , 100 ), except one line that will 
 * contain '-1'. The user will determine which line it will be
 * @author Erkin Aydın
 * @version 21/11/2020
 */

public class Lab04f1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner( System.in );
        PrintWriter fout;
        
        // Constants
        
        // Variables
        
        int min;
        int max;
        int numberOfRandomValues;
        int randomValuesPrinted;
        int randomValue;
        int minusOneLine;
        int minusOneLineDetecter;
        String Lab04dFileName;
        
        System.out.println( "Welcome to Lab04d exercises!" );
        
        // This the part we get the file name as an input and create the file.
        System.out.print( "Please enter the file name: " );
        
        Lab04dFileName = scan.nextLine();
        fout = new PrintWriter( Lab04dFileName );
    
        // Here we get the number of values as an input and deretmine how many values we will create
        System.out.print( "Please enter the number of values you want to create: " );
        numberOfRandomValues = scan.nextInt();
        
        // We have to make sure that number of random values is bigger than 0.
        if ( numberOfRandomValues <= 0 )
        {
            System.out.println( "Such number of values can not exist." );
        }
        else
        {
            // Here we ask the user at which line they would like to print '-1'.
            System.out.print( "At which line you would like to print '-1': " );
            minusOneLine = scan.nextInt();
            
            // We have to make sure that the line they want to print '-1' exists.
            if ( minusOneLine <= 0 )
            {
                System.out.println( "Such line number can not exist." );
            }
            else
            {
                // This is the part we initialize necessary parts to 0, and determine the ceiling number.
                minusOneLineDetecter = 0;
                randomValuesPrinted = 0;
                min = 0;
                max = 100;
                
                System.out.println( "Printing Time!" );
                
                // We create random values from 0.0 upto 1.0 and turn them into integers and print them.
                while ( randomValuesPrinted < numberOfRandomValues )
                {
                    // This detecter number should increase...
                    minusOneLineDetecter++;
                    
                    //... so we can print '-1' when we should
                    if ( minusOneLineDetecter == minusOneLine )
                    {
                        System.out.println( -1 );
                        fout.println( -1 );
                        randomValuesPrinted++;
                    }
                    /* If the line number is not the same with the line number that we should print '-1',
                    the program should continue creating ant printing random values on the intervar [ 0 , 100 ) */
                    else
                    {
                        randomValue =  (int)( Math.random() * ( max - min ) + min );
                        System.out.println( randomValue );
                        fout.println( randomValue );
                        randomValuesPrinted++;
                    }
                }
            }
        }
        scan.close();
        fout.close();
    }
}
