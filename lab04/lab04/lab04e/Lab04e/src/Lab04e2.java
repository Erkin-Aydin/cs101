import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * __Lab04e2: Second part of Lab04e. This program reads a file to a point and
 * then reports number of integers in that file and reports their sum.
 * @author Erkin Aydın
 * @version 21/11/2002
 */


public class Lab04e2
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        Scanner scan = new Scanner( System.in );
        // Here, we determine the name of the file that the program will read
        Scanner dataInputFile = new Scanner( new File( "testfileLab04e2.txt" ) );
        
        // Constants
        
        final int NUMBER_OF_INTEGER_VALUES = 14;
        
        // Variables
        
        int inputValueFromTheFile;
        int numberOfIntegersProcessed;
        int sumOfIntegers;
        
        System.out.println( "Welcome to Lab04e exercise!" );
        
        /* Before we start the process, we have to initialize necessary integers to 0.
        Such as sum of integers and how many integers we processed so far. */
        sumOfIntegers = 0;
        numberOfIntegersProcessed = 0;
        // This program should contiue to work until it reads enough integer values.
        while ( numberOfIntegersProcessed < NUMBER_OF_INTEGER_VALUES )
        {
            /* Here we read integers from the file. Then calculate sum of 
            integers and number of integers processed so far one by one. */
            inputValueFromTheFile = dataInputFile.nextInt();
            sumOfIntegers = sumOfIntegers + inputValueFromTheFile;
            numberOfIntegersProcessed++;
        }
        // We print how many integers we processed and their sum.
        System.out.println("There are " + numberOfIntegersProcessed + 
                          " integer values processed and their sum is " + sumOfIntegers);
        
        
        dataInputFile.close();
        scan.close();
    }
}
