import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * __Lab04g: We will calculate the average value of the integers, and determine the maximum and minimum values.
 * When we reach to the first negative integer on the file, the program will stop and report average, maximum
 * and minimum values.
 * @author Erkin Aydın
 * @version 21/11/2002
 */
public class Lab04g
{
    public static void main( String[] args ) throws IOException
    {
        Scanner scan = new Scanner( System.in );
        Scanner dataInputFile = new Scanner( new File( "testfileLab04g.txt" ) );
        
        // Constants
        
        // Variables
        
        int inputValueFromTheFile;
        int numberOfIntegersProcessed;
        int sumOfIntegers;
        double averageValue;
        int maxNumber;
        int minNumber;
        
        System.out.println( "Welcome to Lab04g exercise!" );
        
        // We have to initialize necessary numbers to 0.
        numberOfIntegersProcessed = 0;
        sumOfIntegers = 0;
        maxNumber = 0;
        minNumber = 0;
        inputValueFromTheFile = 0;
        
        // The program should stop when it reads the first negative value.
        while ( inputValueFromTheFile >= 0 )
        {
            // The program reads values from the file.
            inputValueFromTheFile = dataInputFile.nextInt();
            
            /* We should define maximum and minimum values first,
            so we can be able to compare them later on */
            if ( numberOfIntegersProcessed == 0 )
            {
                maxNumber = inputValueFromTheFile;
                minNumber = inputValueFromTheFile;
            }
            
            /* Here, we check whether maximum value is still maximum;
            if not, we redefine it */
            else if ( inputValueFromTheFile >= maxNumber )
            {
                maxNumber = inputValueFromTheFile;
            }
            
            /* Here, we check whether minimum value is still minimum;
            if not, we redefine it */
            else if ( inputValueFromTheFile <= minNumber )
            {
                minNumber = inputValueFromTheFile;
            }
            
            /* This is the part that will prevent our program doing anything 
            when it reads the first negative value. */
            if ( inputValueFromTheFile < 0 )
            {
            }
            
            /* If the program do not read the first negative value, 
            it should continue as always. */
            else
            {
                sumOfIntegers = sumOfIntegers + inputValueFromTheFile;
                numberOfIntegersProcessed++;
            }
        }
        
        // This is the part we calculate average value.
        averageValue = sumOfIntegers / numberOfIntegersProcessed;
        
        // And this is the part we print everything one by one.
        System.out.println( "The average value is " + averageValue );
        System.out.println( "The maximum value is " + maxNumber );
        System.out.println( "The minimum value is " + minNumber );
        System.out.println( "Number of integers processed is: " + numberOfIntegersProcessed );
        
        dataInputFile.close();
        scan.close();
    }
}