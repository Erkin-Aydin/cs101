import java.util.Scanner;
/**
 * __Lab04e1:First part of Lab04e. This program reports number of integers entered by the user and their sum.
 * @author Erkin Aydın
 * @version 21/11/2020
 */
public class Lab04e1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        
        // Constants
        
        final int NUMBER_OF_INTEGER_VALUES = 14;
        
        // Variables
        
        int inputValueFromTheFile;
        int numberOfIntegersProcessed;
        int sumOfIntegers;
        
        System.out.println( "Welcome to Lab04e1 exercise!" );
        
        /* Before we start the process, we have to initialize necessary integers to 0.
        Such as sum of integers and how many integers we processed so far. */
        sumOfIntegers = 0;
        numberOfIntegersProcessed = 0;
        
        // This program should contiue to work until it reads enough integer values.
        while ( numberOfIntegersProcessed < NUMBER_OF_INTEGER_VALUES )
        {
            /* Here we take integer values as input from the user and then, calculate sum of integers
            and number of integers processed so far one by one */
            System.out.print( "Please enter a number: " );
            inputValueFromTheFile = scan.nextInt();
            sumOfIntegers = sumOfIntegers + inputValueFromTheFile;
            numberOfIntegersProcessed++;
        }
        // We print how many integers we processed and their sum.
        System.out.println("There are " + numberOfIntegersProcessed +
                           " integer values and their sum is " + sumOfIntegers);
        
        scan.close();
    }
}