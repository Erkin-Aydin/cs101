import java.util.Scanner;

/**
 * Lab04a-Second Time
 * @author Erkin Aydın
 * @version 2.0 9/11/2020
*/

public class Lab04a
{
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner ( System.in );
        
        // Constants
        
        final String VALID_MESSAGE = "Valid value entered.";
        final String INVALID_MESSAGE = "Invalid value entered.";
        final String INPUT_MESSAGE = "Please enter a positive integer value: ";
        
        // Variables
        
        int task1InputValue;
        int task1IncreasingNumber;
        int task2InputValue;
        int task2IncreasingNumber;
        int task3InputValue;
        int task3DecreasingNumber;
        int task4InputValue;
        int task4IncreasingNumber;
        int task5InputValue;
        int task5IncreasingNumber;
        int task6InputValue;
        int task6IncreasingNumber;
        int task6DecreasingNumber;
        int task7InputValue;
        int task7IncreasingNumber;
        
        
        /* Task 1: Write a while loop to output the integer values 
        from 0 up to n exclusive. Have the output appear on a single 
        line with values separated by a space. */
        
        System.out.println( "Task 1 starts..." );
        System.out.print( INPUT_MESSAGE );
        task1InputValue = scan.nextInt();
        if ( task1InputValue <= 0 )
        {
            System.out.println( INVALID_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task1IncreasingNumber = 0;
            while ( task1IncreasingNumber <= task1InputValue )
            {
                System.out.print( task1IncreasingNumber + " " );
                task1IncreasingNumber = task1IncreasingNumber + 1;
            }
        }
        System.out.println( );
        System.out.println( "Task 1 done!" );
        System.out.println( );
        
        /* Task 2: Write a while loop to output the integer values 
        from 0 up to n exclusive. The output should have five values 
        per line, with values separated by a space. */
        
        System.out.println( "Task 2 starts..." );
        System.out.print( INPUT_MESSAGE );
        task2InputValue = scan.nextInt( );
        if ( task2InputValue <= 0 )
        {
            System.out.println( INVALID_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task2IncreasingNumber = 0;
            while ( task2IncreasingNumber <= task2InputValue )
            {
                System.out.print( task2IncreasingNumber + " " );
                task2IncreasingNumber = task2IncreasingNumber + 1;
                if ( task2IncreasingNumber % 5 == 0 && task2IncreasingNumber != 0 )
                {
                    System.out.println();
                }
            }
        }
        System.out.println( );
        System.out.println( "Task 2 done!" );
        System.out.println( );
        
        /* Task 3: Write a while loop to output the integer values 
        from n down to 0 inclusive. Have the output appear on a single 
        line with values separated by a space. */
        
        System.out.println( "Task 3 starts..." );
        System.out.print( INPUT_MESSAGE );
        task3InputValue = scan.nextInt( );
        if ( task3InputValue <= 0 )
        {
            System.out.println( INVALID_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task3DecreasingNumber = task3InputValue;
            while ( task3DecreasingNumber >= 0 )
            {
                System.out.print( task3DecreasingNumber + " " );
                task3DecreasingNumber = task3DecreasingNumber - 1;
            }
        }
        System.out.println( );
        System.out.println( "Task 3 done!" );
        System.out.println( );
        
        /* Task 4: Write a while loop to output the even values 
        from -n u to n inclusive. Have your output appear on a single 
        line with values separated by a space. */
        
        System.out.println( "Task 4 starts..." );
        System.out.print( INPUT_MESSAGE );
        task4InputValue = scan.nextInt( );
        if ( task3InputValue <= 0 )
        {
            System.out.println( INVALID_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task4IncreasingNumber = - task4InputValue;
            while ( task4IncreasingNumber <= task4InputValue )
            {
                System.out.print( task4IncreasingNumber + " " );
                task4IncreasingNumber = task4IncreasingNumber + 1;
            }
        }    
        System.out.println( );
        System.out.println( "Task 4 done!" );
        System.out.println( );
        
        /* Task 5: Write a while loop that outputs 
        (separated by spaces, five numbers per line ) 
        the squares of the even values from 0 up to n inclusive. */
        
        System.out.println( "Task 5 starts..." );
        System.out.print( INPUT_MESSAGE );
        task5InputValue = scan.nextInt( );
        if ( task5InputValue <= 0 )
        {
            System.out.println( INPUT_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task5IncreasingNumber = 0;
            while ( task5IncreasingNumber <= task5InputValue )
            {
                System.out.print( task5IncreasingNumber + " " );
                task5IncreasingNumber = task5IncreasingNumber + 1;
                
                if ( task5IncreasingNumber % 5 == 0 && task5IncreasingNumber != 0 )
                {
                    System.out.println( );
                }
            }
        }
        System.out.println( );
        System.out.println( "Task 5 done!" );
        System.out.println( );
        
        /* Task 6: Write a while loop that outputs (separated by spaces, five numbers per line) 
        the values which are divisible by 3 or 4, but not both, 
        from n down to 3 inclusive.  For example, if n is 12, it should display 9 8 6 4 3. */
        
        System.out.println( "Task 6 starts..." );
        System.out.print( INPUT_MESSAGE );
        task6InputValue = scan.nextInt( );
        if ( task6InputValue <= 0 )
        {
            System.out.println( INVALID_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task6DecreasingNumber = task6InputValue;
            task6IncreasingNumber = 0;
            while ( task6DecreasingNumber >= 3 )
            {
                while ( ( task6DecreasingNumber % 3 == 0 || task6DecreasingNumber % 4 == 0 ) && task6DecreasingNumber % 12 != 0 )
                {
                    System.out.print( task6DecreasingNumber + " " );
                    task6DecreasingNumber = task6DecreasingNumber - 1;
                    task6IncreasingNumber = task6IncreasingNumber + 1;
                    if ( task6IncreasingNumber % 5 == 0 )
                    {
                        System.out.println( );
                    }
                }
                task6DecreasingNumber = task6DecreasingNumber - 1;
            }
        }
        System.out.println( );
        System.out.println( "Task 6 done!" );
        System.out.println( );
        
        /* Task 7: Write a while loop that outputs all of the divisors of n. 
        For example, if n is 12, it should display 2 3 4 6 12. */
        
        System.out.println( "Task 7 starts..." );
        System.out.print( INPUT_MESSAGE );
        task7InputValue = scan.nextInt( );
        if ( task7InputValue <= 0 )
        {
            System.out.print( INVALID_MESSAGE );
        }
        else
        {
            System.out.println( VALID_MESSAGE );
            task7IncreasingNumber = 2;
            while ( task7IncreasingNumber <= task7InputValue )
            {
                if ( task7InputValue % task7IncreasingNumber == 0 )
                {
                    System.out.print( task7IncreasingNumber + " " );
                    task7IncreasingNumber = task7IncreasingNumber + 1;
                }
                task7IncreasingNumber = task7IncreasingNumber + 1;
            }
        }
        System.out.println( );
        System.out.println( "Task 7 done!" );
        System.out.println( );
        
        scan.close();
    }
}