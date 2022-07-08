import java.util.Scanner;

public class Lab03a {
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner ( System.in);
        
        int numberOfEvenValues = 0;
        int numberOfOddValues = 0;
        int sum1 = 0;
        int sum2;
        
        for ( int x = 0; x <= 50; x++ )
        {
    
            System.out.println( "Value of x is " + x );
    
            if ( 12 < x && x < 25 )
            {
                System.out.println( x + " is NOT out of range 12-25.");
            }
            else
            {
                System.out.println( x + " is out of range 12-25.");
            }
            if ( (x % 2) == 0 )
            {
                numberOfEvenValues = 1 + numberOfEvenValues;  
            }    
            else
            {    
                numberOfOddValues = 1 + numberOfOddValues;
            }    
                 
            if ( x % 5 == 0 )
            {
                System.out.println( "Hi Five");
                System.out.println( "");
            }
            else if ( x % 2 == 0 )
            {
                System.out.println( "Hi Two");
                System.out.println( "");
            }
            else if ( x % 3 == 0 || x % 7 == 0 )
            {
                System.out.println( "Hi ThreeOrSeven");
                System.out.println( "");
            }
            else
            {
                System.out.println( "Hi Others");
                System.out.println( "");
            }    
        }
         
        for ( int x = 0; x <= 50; x++ )
        {
            if ( (x % 2) == 0 )
            {
                numberOfEvenValues = 1 + numberOfEvenValues;  
            }    
            else
            {    
                numberOfOddValues = 1 + numberOfOddValues;
            }    
        }    
        
        System.out.println( "There are " + numberOfEvenValues + " even values that x takes." );
        System.out.println( "There are " + numberOfOddValues + " odd values that x takes" );
        
        for ( int x = 0; x <= 50; x++ )
        {
            if ( x % 5 == 0 )
            {
                System.out.println( x );
                System.out.println( "Hi Five");
                System.out.println( "");
            }
            else if ( x % 2 == 0 )
            {
                System.out.println( x );
                System.out.println( "Hi Two");
                System.out.println( "");
            }
            else if ( x % 3 == 0 || x % 7 == 0 )
            {
                System.out.println( x );
                System.out.println( "Hi ThreeOrSeven");
                System.out.println( "");
            }
            else
            {
                System.out.println( x );
                System.out.println( "Hi Others");
                System.out.println( "");
            }     
        }    
        
        System.out.print( "Please enter n value: ");
        int n = scan.nextInt();
        
        for ( int x = 0; x <= 50; x++ )
        {
            if ( x <= n )
            {
                sum1 = x + sum1;
            }
        }    
        
        sum2 = ( n * n + n )/ 2;
        
        if ( sum1 == sum2 )
        {
            System.out.println( "Sums are the same and they are " + sum1 + ".");
        }
        else
        {
            System.out.println( "Sums are not the same, sum1 is " + sum1 + " and sum2 is " + sum2 + ".");
        }
        
        
        scan.close();
    }
}
