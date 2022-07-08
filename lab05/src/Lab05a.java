import java.util.Scanner;

/**
 * __Lab05a: This program takes width, length and thickness as inputs from
 * the user and creates suitable recktangulars with a hole, if it suits.
 * @author Erkin Aydın
 * @version 26/11/2020
 */

public class Lab05a
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        
        // Constants
        
        final String ERROR_MESSAGE = "Error: all values must be positive!";
        final String STAR = "*";
        final String EMPTY = " ";
        
        // Variables
        
        int width;
        int height;
        int thickness;
        int a;
        int b;
        boolean again;
        
        System.out.println( "Welcome to Lab05a exercise!" );
        
        /* Our program should at least create a pattern once, and if the user
        wants to use it again, it should work again. Therefore we have to use
        do-while here. */
        do
        {
            // Width should be positive
            System.out.print( "Please enter an integer value as width: " );
            width = scan.nextInt();
            
            if ( width <= 0 )
            {
                System.out.println( "Such width can not exist!" );
                System.out.println( ERROR_MESSAGE );
            }
            else
            {
                // Height should be positive.
                System.out.print( "Please enter an integer value as height: " );
                height = scan.nextInt();
                
                if ( height <= 0 )
                {
                    System.out.println( "Such length value can not exist!" );
                    System.out.println( ERROR_MESSAGE );
                }
                else
                {
                    // Thickness should be positive.
                    System.out.print( "Lastly, please enter an integer value as thickness: " );
                    thickness = scan.nextInt();
                    
                    if ( thickness <= 0 || thickness > width || thickness > height)
                    {
                        System.out.println( "Such thickness value can not exist!" );
                        System.out.println( ERROR_MESSAGE );
                    }
                    else
                    {
                        /* Here, we determine whether there will be a hole inside the rectangular.
                        If not, then there is no need to do further calculation, printing a simple
                        rectangular with the area of (width)x(height) would be enough. */
                        if ( thickness >= (double)height / 2 || thickness >= (double)width / 2 )
                        {
                            for ( a = 0; a < height; a++ )
                            {
                                for ( b = 0; b < width; b++ )
                                {
                                    System.out.print( STAR );
                                }
                                System.out.println();
                            }
                            System.out.println( "Oops... no hole!" );
                        }
                        /*If there will be a hole, then we need to divide the rectangular into three pieces:
                        Upper-part, Middle-part, Ending-part. */
                        else
                        {
                            
                            /*This is the upper-part. Its height should be equal to thickness
                            and ist width should stay the same. */
                            for ( a = 0; a < thickness; a++ )
                            {
                                for ( b = 0; b < width; b++ )
                                {
                                    System.out.print( STAR );
                                }
                                System.out.println();
                            }
                            
                            /* This is the middle-part, it will look like a gate between two pillars.
                            Both pillars should have the height of ((height)-2(thickness)), and have the same thickness
                            as it is inputted. The gate should have the height of((height)-2(thickness)),
                            and a thickness of ((width)-2(thickness)). */
                            for ( a = 0; a < height - 2 * thickness; a++ )
                            {
                                // First pillar.
                                for ( b = 0; b < thickness; b++ )
                                {
                                    System.out.print( STAR );
                                }
                                
                                // The gate.
                                for ( b = 0; b < width - 2 * thickness; b++ )
                                {
                                    System.out.print( EMPTY );
                                }
                                
                                // Second pillar.
                                for ( b = 0; b < thickness; b++ )
                                {
                                    System.out.print( STAR );
                                }
                                System.out.println();
                            }
                            
                            /* This is the ending part, there is no difference between the upper part
                            and ending part. */
                            for ( a = 0; a < thickness; a++ )
                            {
                                for ( b = 0; b < width; b++ )
                                {
                                    System.out.print( STAR );
                                }
                                System.out.println();
                            }
                        }
                    }
                }
            }
            System.out.print( "Would you like to try again? If so, type 'y' or 'Y': " );
            scan.nextLine();
            again = scan.nextLine().equalsIgnoreCase ( "Y" );
        } while ( again );
        scan.close();
    }
}