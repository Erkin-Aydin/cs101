import java.util.Scanner;
import java.util.Locale;

/**
 * Lab06: Method Madness: We created our own methods and used them
 * @author Erkin Aydın
 * @version 3/12/2020
 */

public class Lab06
{
    /**
     * This method calculates the required power of any real value
     * @param x is the real value that we will calculate its power
     * @param y is the power value
     * @return gives the power of the real value
     */
    public static double powerFunction( double x, int y )
    {
        // Variables
        
        double z;
        int powerCounter;
        
        z = 1.0;
        
        // If the power is 0, then it won't do any calculations and just print 1.0.
        for ( powerCounter = 0; powerCounter < y; powerCounter++ )
        {
            z = z * x;
        }
        
        return z;
    }
    
    /**
     * This method calculates the factorial of a positive integer value
     * @param n is the positive integer value that we will calculate its factorial
     * @return gives the factorial on the positive integer value
     */
    public static double factorial( int n )
    {
        // Variables
        
        double z;
        int countNumber;
        int factorialNumber;
        
        // Initialization part
        
        z = 1;
        factorialNumber = 0;
        
        for ( countNumber = 0; countNumber < n; countNumber++ )
        {
            factorialNumber++;
            z = z * factorialNumber;
        }
        
        return z;
    }
    
    /**
     * This method reverses each word on a string
     * @param a is the string that we will reverse its words
     * @return gives the string with reversed words
     */
    public static String reverse( String a )
    {
        // Variables
        
        String b;
        int charCounter;
        
        // Here, we initialize charCounter to the number of last char.
        charCounter = a.length() - 1;
        b = "";
        
        // And we reverse the word by writing it backwards.
        while ( 0 <= charCounter )
        {
            b = b + a.charAt( charCounter );
            charCounter--;
        }
        
        return b;
    }
    
    /**
     * This method converts a binary value to its decimal equivalent
     * @param base2 is the binary number we will convert to decimal
     * @return gives the decimal equivalent of base2
     */
    public static int toDecimal ( String base2 )
    {
        // Variables
        
        int lengthOfBase2;
        int lengthCounter;
        int charCounterBackwards;
        int base10;
        
        // Initialization part.
        
        lengthOfBase2 = base2.length();
        charCounterBackwards = lengthOfBase2 - 1;
        base10 = 0;
        
        /* If the character is 1, then 2^(character number) calculation will be made and if it is not,
        then there will be no calculations. Sum of all our calculations will give us the decimal equvalent of
        the binary number */
        
        for (lengthCounter = 0; lengthCounter < lengthOfBase2; lengthCounter++ )
        {
            if ( Character.getNumericValue(base2.charAt( charCounterBackwards ) ) == 1 )
            {
                base10 = (int)( base10 + powerFunction( 2, lengthCounter ) );
            }
            charCounterBackwards--;
        }
        return base10;
    }
    
    /**
     * This method changes decimal numbers to their binary equivalent
     * @param base10 is the decimal number
     * @return gives the binary equivalent of the decimal number
     */
    public static String toBinary ( int base10 )
    {
        
        // Variables
        
        String base2;
        int integerBase2;
        int powerCounter;
        
        // Initialization Part
        
        base2 = "";
        integerBase2 = 0;
        
        /* We will decrease the decimal number as the biggest small value of 2's powers. Then we 
        will increase the binary number, which is previously initialized to 0, as 10^(character number).
        This way, we will create the binary equivalent of the decimal number. */
        
        while ( base10 > 0 )
        {
            for ( powerCounter = 0; powerFunction( 2, powerCounter + 1 ) <= base10; powerCounter++ );
            base10 = (int) ( base10 - powerFunction( 2, powerCounter ) );
            integerBase2 = integerBase2 + (int) powerFunction( 10, powerCounter );
        }
        base2 = base2 + integerBase2;
        
        return base2;
    }
    
    // Exercises start here.
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner ( System.in );
        scan.useLocale ( Locale.US );
        
        // Constants ( Only contains a line to make the terminal look a bit more nice )
        
        final String LINE = "---------------------------------------------------------------------------";
        
        // Variables ( of each exercises )
        
        // Variable of Exercise 1
        
        int valueExercise1;
        
        // Variable of Exercise 2
        
        int valueExercise2;
        
        // Variables of Exercise 3
        
        String firstBinaryExercise3;
        int firstDecimalExercise3;
        String secondBinaryExercise3;
        int secondDecimalExercise3;
        int theSumExercise3;
        String resultExercise3;
        
        // Variables of Exercise 4
        
        String inputStringExercise4;
        String outputStringExercise4;
        char currentChar;
        
        // Variables of Exercise 5
        
        double xRadiansExercise5;
        double taylorSeriesExercise5;
        double sinValueExercise5;
        
        // Variables of Exercise 6
        
        double xRadiansExercise6;
        int termCounterExercise6;
        double termNumberExercise6;
        double taylorSeriesExercise6;
        double errorRateExercise6;
        
        /* Exercise 1: Print a table with columns n, n-squared, 
        n-cubed & n to the power 4, for values of n from -1 to 10 inclusive */
        
        System.out.println( "Welcome to Exercise 1!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        valueExercise1 = -1;
        
        // This printf line just determines categories, nothing more or less.
        
        System.out.printf( "%-10s %-20s %-20s %-20s", "n" , "n^2" , "n^3" , "n^4" );
        System.out.println();
        System.out.println( LINE );
        
        while ( valueExercise1 <= 10)
        {
            // Here, we print every number fitting to their categories, from -(1) to 10.
            
            System.out.printf( "%-10d %-20f %-20f %-20f", valueExercise1 ,powerFunction ( valueExercise1 , 2),
                            powerFunction ( valueExercise1, 3 ),powerFunction ( valueExercise1, 4 ) );
            valueExercise1++;
            System.out.println();
            System.out.println( LINE );
        }
        System.out.println( "Exercise 1 Done!" );
        System.out.println();
        
        // Exercise 2: Print a table of n and n-factorial, for values of n from 1 to 15
        
        System.out.println( "Welcome to Exercise 2!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        valueExercise2 = 1;
        
        System.out.printf( "%-10s %-20s", "n" , "n!" );
        System.out.println();
        System.out.println( LINE );
        
        while ( valueExercise2 <= 15 )
        {
            // Here, we print factorial values with normal values fitting to their categories, from (-1) to 10.
            
            System.out.printf("%-10d %-20f", valueExercise2 , factorial( valueExercise2 ) );
            valueExercise2++;
            System.out.println();
            System.out.println( LINE );
        }
        System.out.println( "Exercise 2 Done!" );
        System.out.println();
        
        /* Exercise 3: Read two binary (base-2) Strings from the user, convert them to decimal, 
        then add them together and print the result in binary form */
        
        System.out.println( "Welcome to Exercise 3!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        /* Here, we take binary numbers as inputs from the user, 
        and then, convert them to their decimal equivalent. */
        
        System.out.print( "Enter the first binary number: " );
        firstBinaryExercise3 = scan.next();
        firstDecimalExercise3 = toDecimal ( firstBinaryExercise3 );
        
        System.out.print( "Enter the second binary number: " );
        secondBinaryExercise3 = scan.next();
        secondDecimalExercise3 = toDecimal ( secondBinaryExercise3 );
        
        theSumExercise3 = firstDecimalExercise3 + secondDecimalExercise3;
        
        // Here, we convert their sum to its binary equivalent, and then, we print their sum.
        
        resultExercise3 = toBinary ( theSumExercise3 );
        System.out.println( "The result is: " + resultExercise3 );
        
        System.out.println( LINE );
        System.out.println( "Exercise 3 Done!" );
        System.out.println();
        
        // Exercise 4: Read a line of text from the user and output it again, but with each word reversed.
        
        System.out.println( "Welcome to Exercise 4!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        System.out.print( "Write something and let magic happen: " );
        inputStringExercise4 = scan.nextLine(); // One scanner line gave error, I do not know why...
        inputStringExercise4 = scan.nextLine();
        
        outputStringExercise4 = "";
        
        for ( int index = 0; index < inputStringExercise4.length(); index++ )
        {
            currentChar = inputStringExercise4.charAt( index );
            
            // We will stop if the next character is ' ', and then, reverse the word upto ' ', but not including ' '.
            
            if ( currentChar == ' ' )
            {
                System.out.print( reverse( outputStringExercise4 ) + " " );
                outputStringExercise4 = "";
            }
            else
            {
                outputStringExercise4 = outputStringExercise4 + currentChar;
            }
        }    
        
        System.out.print( reverse ( outputStringExercise4 ) );
        System.out.println();
        
        System.out.println( LINE );
        System.out.println( "Exercise 4 Done!" );
        System.out.println();
        
        /* Exercise 5: print a table that shows the "raw" calculations for the Taylor series expansion of sin(x), 
        where x is read from the user. Your table should have columns for the term number n, 
        and for (-1)^n, x^(2n+1), (2n+1)!, the term itself computed from these values, and the sum of the preceding terms 
        with this one, i.e. the current approximation to sin(x). The term number n should go from 0 up to 10. */
        
        System.out.println( "Welcome to Exercise 5!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        /* We take x value for sin(x) as an input here, and then, we initialize sin value 
        to 0 temporarily (for the sake of further additions).  */
        
        System.out.print( "Enter the x value that we are going to use in calculating sin(x): " );
        xRadiansExercise5 = scan.nextDouble();
        System.out.println( LINE );
        
        sinValueExercise5 = 0.0;
        
        // This printf line just determines our categories.
        
        System.out.printf( "%-5s %14s %28s %28s %20s" , "n" , "(-1)^n" , "x^(2n+1)" , "(2n+1)!" , "sin(x)" );
        System.out.println();
        
        // We use taylor series to calculate sin(x) value.
        
        for ( int n = 0; n <= 10; n++ )
        {
            taylorSeriesExercise5 = powerFunction ( -1, n ) * 
                                    powerFunction ( xRadiansExercise5 , 2 * n + 1 ) / factorial( 2 * n + 1 );
            
            sinValueExercise5 = sinValueExercise5 + taylorSeriesExercise5;
            
            // And here, we print every number fitting to their categories.
            
            System.out.printf( "%-5d %14f %28f %28f %20.12f" , n , powerFunction ( -1, n ) , 
            powerFunction ( xRadiansExercise5 , 2 * n + 1 ) , factorial( 2 * n + 1 ) , sinValueExercise5 );
            System.out.println();
        }
        System.out.println( LINE );
        System.out.println( "They get more and more accurate when n gets higher and higher, but still, they are not accurate enough." );
        System.out.println("If we were to determine maximum value n as high as infinite, it would be accurate." );
        System.out.println( LINE );
        System.out.println( "Exercise 5 Done!" );
        
        /* Exercise 6: More accurate version of Exercise 5! (And also, calculates the error 
        between real value and our calculations) */
        
        System.out.println( "Welcome to Exercise 6!" );
        System.out.println( LINE );
        System.out.println( LINE );
        
        System.out.print( "Enter the x value for sin(x): " );
        xRadiansExercise6 = scan.nextDouble();
        
        System.out.print( "How many terms we will use? Please enter: " );
        termCounterExercise6 = scan.nextInt();
        
        taylorSeriesExercise6 = 0.0;
        termNumberExercise6 = xRadiansExercise6;
        
        // We used Taylor series again, in a different form
        
        for ( int n = 1; n <= termCounterExercise6; n++ )
        {
            taylorSeriesExercise6 = taylorSeriesExercise6 + termNumberExercise6;
            termNumberExercise6 = -termNumberExercise6 * powerFunction( xRadiansExercise6, 2 ) /
                                ( ( 2 * n ) * ( 2 * n + 1 ) );
        }
        errorRateExercise6 = Math.abs ( Math.sin ( xRadiansExercise6 ) - taylorSeriesExercise6 );
        
        System.out.println( "Calculated sin(x) value: " + taylorSeriesExercise6 );
        System.out.println( "sin(x) value according to Math.sin(x): " + Math.sin ( xRadiansExercise6 ) );
        System.out.println( "Error rate: " + errorRateExercise6 );
        System.out.println( LINE );
        System.out.println( "Exercise 6 Done!" );
        
        scan.close();
    }
}