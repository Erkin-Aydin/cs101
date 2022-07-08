import java.util.Scanner ;
/**
 * __Flower Computer 300___
 * @author __Erkin Aydın___
 * @version __28/10/2020__
 */
public class Lab02d
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner ( System.in);
       
        // constants --> Does Not Exist
        
        // variables
        System.out.println( "Start...");
        int flowerPerMetersquare = 17 ;
        double a ;
        double b ;
        double c ;
        double s ;
        double area ;
        double numberOfFlowers ;
        
        System.out.println ( "Hello! Welcome to FlowerComputer 3000 !" );
        System.out.println ( " Now, you will enter three values, then we will compute the number of flowers that can be contanined by a triangle having these values as side lengths." );
        
        // Now user will enter three integer values
        
        System.out.print ( "Please enter the first value: ");
        a = scan.nextInt ();
        System.out.println ( "");
        
        System.out.print ( "Please enter the second value: ");
        b = scan.nextInt ();
        System.out.println ( "");
        
        System.out.print ( "Please enter the third value: ");
        c = scan.nextInt ();
        System.out.println ( "");
        
        // Now we will find number of flowers and print it
        
        System.out.println ( "Good! Now we will do some math!");
        
        s = ( a + b + c) / (2);
        area = Math.sqrt( s * (s - a) * (s - b) * (s - c));
        numberOfFlowers = (int)( flowerPerMetersquare * area) ;
        
        System.out.println ( "The number of flowers this triangle can contain is: " + (int)numberOfFlowers);
        System.out.println( "My job is done... Goodbye! ");
        System.out.println( "End.");
        scan.close ();
    }
}