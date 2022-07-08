import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;

/**
 * __Lab04d: This program creates random values on the 
 * interval [ minimum possible number, maximum possible number ]
 * @author Erkin Aydın
 * @version 21/11/2020
 */

public class Lab04d
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
        String Lab04dFileName;
        
        System.out.println( "Welcome to Lab04d exercises!" );
        
        // This the part we get the file name as an input and create the file.
        System.out.print( "Please enter the file name: " );
        Lab04dFileName = scan.nextLine();
        fout = new PrintWriter( Lab04dFileName );
        
        // Here we get the number of values as an input and deretmine how many values we will create
        System.out.print( "Please enter the number of values you want to create: " );
        numberOfRandomValues = scan.nextInt();
        
        System.out.print( "What will the minimum possible value be: " );
        min = scan.nextInt();
        
        System.out.print( "What will the maximum possible value be: " );
        max = scan.nextInt();
        
        // minimum  value should be less than maximum value
        if ( min >= max )
        {
            System.out.println( "Such min-max values can not exist." );
        }
        /* This is where we correct the negative effect of (int)'s working principle. There are 5 different
        conditions and 3 different problems here. One is that if min >= 0, then the maximum value won't be created.
        if min < 0 and max > 0 , then both the minimum and maximum values won't be created. Lastly, if  max <= 0,
        then the minimum value won't be created. To correct this mistakes, the followig code is necessary. */
        else
        {
            if ( min >= 0 && max > 0 )
            {
                max++;
            }
            else if ( min < 0 && max > 0 )
            {
                min--;
                max++;
            }
            else if ( min < 0 && max <= 0 )
            {
                min--;
            }
            
            randomValuesPrinted = 0;
            
            // We create random values from 0.0 upto 1.0 and turn them into integers and print them.
            while ( randomValuesPrinted < numberOfRandomValues )
            {
                randomValue =  (int)( Math.random() * ( max - min ) + min );
                System.out.println( randomValue );
                fout.println( randomValue );
                randomValuesPrinted++;
            }
        }
        scan.close();
        fout.close();
    }
}
