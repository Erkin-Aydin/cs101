import java.util.Scanner;

/**
 * __Lab05b: This program will do 4 things:
 * 1) It will create cells.
 * 2) It will create a multiplication table.
 * 3) It will create cells with cell numbers in it.
 * 4) It will create rows and print their numbers.
 * @author Erkin Aydın
 * @version 26/11/2020
 */

public class Lab05b
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        
        // Constants
        
        final String LINE = "------------------------------------------------------------------------------";
        
        // Variables
        
        int rowNumber;
        int columnNumber;
        int a;
        int b;
        String outputString;
        int lengthOfTheString;
        int startPointOfTheOutput;
        int cellNumber;
        
        System.out.println( "Welcome to Lab05b exercise!" );
        
        /* This is the first exercise. It will create multiple cells in a row 
        and multilpe rows containing these cells. All of these cells will contain the row and
        column number of itself. */
        System.out.println( "Cell Creator starts!" );
        System.out.println();
        System.out.print( "Enter the row number: " );
        rowNumber = scan.nextInt();
        
        // We have to make sure that such row number can exist.
        if ( rowNumber <= 0 )
        {
            System.out.println( "Such row number can not exist!" );
        }
        else
        {
            System.out.print( "Enter the column number: " );
            columnNumber = scan.nextInt();
            
            //We have to make sure that such column number can exist.
            if ( columnNumber <= 0 )
            {
                System.out.println( "Such column number can not exist!" );
            }
            else
            {
                System.out.println( LINE );
                System.out.println( LINE );
                /* Every time column number times of cells printed in a row,
                we have to move to the next line. 'a' is the row number. */
                for ( a = 1; a <= rowNumber; a++ )
                {
                    /* Every time column number timer of cells printed in a row,
                    we have to stop printing and reset 'b', which is the column number.
                    When we get out of this loop, the program will move to the next line
                    due to 'a', row number. */
                    for ( b = 1; b <= columnNumber; b++ )
                    {
                        // Here a represents the row number and b represents the column number.
                        outputString = "   " + a + ',' + b;
                        lengthOfTheString = outputString.length();
                        
                        /* Now we want every cell to be 6 units long. If it is more,
                        we have to decrease number of spaces on the beginning of the cell.
                        Then, we can print it. */
                        if ( lengthOfTheString > 6 )
                        {
                            startPointOfTheOutput = lengthOfTheString - 6;
                            System.out.print( outputString.substring( startPointOfTheOutput, lengthOfTheString ));
                        }
                        // If cell is not longer than 6 units, then we just print it.
                        else
                        {
                            System.out.print( outputString );
                        }
                    }
                    System.out.println();
                }
                System.out.println( LINE );
                System.out.println( LINE );
            }
        }
        System.out.println();
        
        /* This is the second exercise. It will create a multiplication table by
        multiplying the row number and the column number in cells. */
        System.out.println( "Multiplication Table Creator starts!" );
        System.out.print( "Enter the row number: " );
        rowNumber = scan.nextInt();
        
        // We have to make sure such row number can exist.
        if ( rowNumber <= 0 )
        {
            System.out.println( "Such row number can not exist!" );
        }
        else
        {
            System.out.print( "Enter the column number: " );
            columnNumber = scan.nextInt();
            
            // We have to make sure such column number can exist.
            if ( columnNumber <= 0 )
            {
                System.out.println( "Such column number can not exist!" );
            }
            else
            {
                System.out.println( LINE );
                System.out.println( LINE );
                
                /* Same with the first exercise. 'a' is the row number, and it increases
                when we print column number times cells in a row. */
                for ( a = 1; a <= rowNumber; a++ )
                {
                    /* Sme with first exercise, 'b' is the column number and it resets every time
                    we have to move to the next line. */
                    for ( b = 1; b <= columnNumber; b++ )
                    {
                        outputString = "     " + a * b;
                        lengthOfTheString = outputString.length();
                        /* If the cell length is bigger than 6, we have to decrease it to 6
                        by decreasing the number of spaces in the beggining of the cell. Then,
                        we can print the cell. */
                        if ( lengthOfTheString > 6 )
                        {
                            startPointOfTheOutput = lengthOfTheString - 6;
                            System.out.print( outputString.substring( startPointOfTheOutput, lengthOfTheString ) );
                        }
                        /* If the cell length is already 6, then there is no need to
                        decrease it. Printing it would be enough. */
                        else
                        {
                            System.out.print( outputString );
                        }
                    }
                    System.out.println();
                }
                System.out.println( LINE );
                System.out.println( LINE );
            }
        }
        System.out.println();
        
        /* This is the third exercise. It creates cells containing its number
        in it.*/
        System.out.println( "Cell Number Creator starts!" );
        System.out.print( "Enter the row number: " );
        rowNumber = scan.nextInt();
        
        // We have to make sure such row number can exist.
        if ( rowNumber <= 0 )
        {
            System.out.println( "Such row number can not exist!" );
        }
        else
        {
            System.out.print( "Enter the column number: " );
            columnNumber = scan.nextInt();
            
            // We have to make sure such column number can exist.
            if ( columnNumber <= 0 )
            {
                System.out.println( "Such column number can not exist!" );
            }
            else
            {
                System.out.println( LINE );
                System.out.println( LINE );
                cellNumber = 0;
                
                // Same with previous exercises.
                for ( a = 1; a <= rowNumber; a++ )
                {
                    
                    // Same with previous exercises.
                    for ( b = 1; b <= columnNumber; b++ )
                    {
                        outputString = "   " + cellNumber;
                        lengthOfTheString = outputString.length();
                        
                        /* Here cell length of 4 units would be enough. If it
                        gets bigger then four, we will decrease it to 4 by decreasing
                        the number of spaces in the beginning of the cell. Then, we can
                        print the cell. */
                        if ( lengthOfTheString > 4 )
                        {
                            startPointOfTheOutput = outputString.length() - 4;
                            System.out.print( outputString.substring( startPointOfTheOutput, lengthOfTheString ) );
                        }
                        
                        // If it is equal to 4, then printing the cell would be enough.
                        else
                        {
                            System.out.print( outputString );
                        }
                        cellNumber++;
                    }
                    System.out.println();
                }
                System.out.println( LINE );
                System.out.println( LINE );
            }
        }
        System.out.println();
        
        /* This is the fourth exercise. It will print the row number to the
        first cell on the row, and then print ",-" to other cells on the row. */
        System.out.println( "Row Number Printer starts!" );
        System.out.print( "Enter the row number: " );
        rowNumber = scan.nextInt();
        
        // We have to check that such row number can exist.
        if ( rowNumber <= 0 )
        {
            System.out.println( "Such row number can not exist!" );
        }
        else
        {
            System.out.print( "Enter the column number: " );
            columnNumber = scan.nextInt();
            
            // We have to make sure that such column number can exist.
            if ( columnNumber <= 0 )
            {
                System.out.println( "Such column number can not exist!" );
            }
            else
            {
                System.out.println( LINE );
                System.out.println( LINE );
                cellNumber = 0;
                
                // Same with previous exercises.
                for ( a = 1; a <= rowNumber; a++ )
                {
                    
                    // Same with previous exercises.
                    for ( b = 1; b <= columnNumber; b++ )
                    {
                        
                        // If it is the first column of the row, we print its number.
                        if ( b == 1 )
                        {
                            System.out.print( a );
                        }
                        // for other cells in the row, we print ",-".
                        else
                        {
                            System.out.print( ",-" );
                        }
                    }
                    System.out.println();
                }
                System.out.println( LINE );
                System.out.println( LINE );
            }
        }
        System.out.println();
        System.out.println( "Lab05b Done!" );
        
        scan.close();
    }
}