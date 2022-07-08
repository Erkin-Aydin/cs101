import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;

/**
 * __Lab04f2: Second part of Lab04f. This program creates three random negative integer values 
 * and prints them on three random lines, while on the other lines, it just creates and prints 
 * positive integer values.
 * @author Erkin Aydın
 * @version 21/11/2020
 */

public class Lab04f2
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
        int firstRandomNegativeValueLine;
        int secondRandomNegativeValueLine;
        int thirdRandomNegativeValueLine;
        int realLineNumber;
        String Lab04dFileName;
        
        System.out.println( "Welcome to Lab04d exercises!" );
        
        // This the part we get the file name as an input and create the file.
        System.out.print( "Please enter the file name: " );
        
        Lab04dFileName = scan.nextLine();
        fout = new PrintWriter( Lab04dFileName );
    
        // Here we get the number of values as an input and deretmine how many values we will create
        System.out.print( "Please enter the number of values you want to create: " );
        numberOfRandomValues = scan.nextInt();
        
        // We have to make sure taht such number of random values can actually exist.
        if ( numberOfRandomValues <= 0 )
        {
            System.out.println( "Such number of values can not exist." );
        }
        else
        {
            /* Here we initialize necessary numbers to 0, determine the ceiling number,
            and determine which line numbers should contain negative values. Randomly, of course. */
            realLineNumber = 0;
            randomValuesPrinted = 0;
            min = 0;
            max = 100;
            firstRandomNegativeValueLine = (int)( Math.random() * numberOfRandomValues );
            secondRandomNegativeValueLine = (int)( Math.random() * numberOfRandomValues );
            thirdRandomNegativeValueLine = (int)( Math.random() * numberOfRandomValues );
            
            System.out.println( "Printing Time!" );
            // We create random values from 0.0 upto 1.0 and turn them into integers and print them.
            while ( randomValuesPrinted < numberOfRandomValues )
            {
                /* This is the line number the program is working at that moment. It should increase 
                every time the program starts working on a new line. */
                realLineNumber++;    
                
                /* Now, the program will check whether the line number is the same with any of the 
                line numbers that we want to print negative values on. */
                if ( firstRandomNegativeValueLine == realLineNumber || 
                    secondRandomNegativeValueLine == realLineNumber ||
                    thirdRandomNegativeValueLine == realLineNumber )
                {
                    // If so, the program will create and print a negative integer value.
                    randomValue = -( (int)( Math.random() * ( max - min ) + min ) );
                    System.out.println( randomValue );
                    fout.println( randomValue );
                    randomValuesPrinted++;
                }
                /* If the line number is not the same with any of the line numbers we
                want to print negative values on, the program should continue creating 
                and printing random positive integer values. */
                else
                {
                    randomValue =  (int)( Math.random() * ( max - min ) + min );
                    System.out.println( randomValue );
                    fout.println( randomValue );
                    randomValuesPrinted++;
                }
            }    
        }
        scan.close();
        fout.close();
    }
}