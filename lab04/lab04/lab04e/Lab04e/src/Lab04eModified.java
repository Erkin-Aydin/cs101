import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Lab04eModified: Same with Lab04e2, except that this program reports average,
 * maximum and minimum values that are created.
 * @author Erkin Aydın
 * @version 21/11/2020
 */
public class Lab04eModified
{
    public static void main( String[] args ) throws IOException
    {
        Scanner scan = new Scanner( System.in );
        Scanner dataInputFile = new Scanner( new File( "testfileLab04eModified.txt" ) );
        
        // Constants
        
        final double NUMBER_OF_TAKEN_VALUES = 100000;
        
        // Variables
        
        int inputValueFromTheFile;
        int numberOfIntegersProcessed;
        int sumOfIntegers;
        double averageValue;
        int maxNumber;
        int minNumber;
        
        System.out.println( "Welcome to Lab04eModified!" );
        
        // We have to initialize necessary numbers to 0.
        numberOfIntegersProcessed = 0;
        sumOfIntegers = 0;
        maxNumber = 0;
        minNumber = 0;
        
        while ( numberOfIntegersProcessed < NUMBER_OF_TAKEN_VALUES )
        {
            /* We take values as input and then calculate their 
            sum and keep track of the number of integers we processed. */
            inputValueFromTheFile = dataInputFile.nextInt();
            sumOfIntegers = sumOfIntegers + inputValueFromTheFile;
            numberOfIntegersProcessed++;
            
            /* We should define maximum and minimum values first,
            so we can be able to compare them later on */
            if ( numberOfIntegersProcessed == 0 )
            {                    
                maxNumber = inputValueFromTheFile;
                minNumber = inputValueFromTheFile;
            }
            
            /* Here, we check whether maximum value is still maximum;
            if not, we redefine it */
            if ( maxNumber <= inputValueFromTheFile )
            {
                maxNumber = inputValueFromTheFile;
            }
            
            /* Here, we check whether minimum value is still minimum;
            if not, we redefine it */
            if ( minNumber >= inputValueFromTheFile )
            {
                minNumber = inputValueFromTheFile;
            }
        }
        
        // This is the part we calculate average value.
        averageValue = sumOfIntegers / NUMBER_OF_TAKEN_VALUES;
        
        // And this is the part we print everything one by one.
        System.out.println( "The average value is " + averageValue );
        System.out.println( "The maximum value is " + maxNumber );
        System.out.println( "The minimum value is " + minNumber );
        
        dataInputFile.close();
        scan.close();
    }
}
