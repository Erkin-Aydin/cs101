import java.util.Scanner;
/** __Lab02c___
 * @author __Erkin Aydın___
 * @version __28/10/2020__
 */

public class Lab02c
{
    public static void main(String[] args)
    {
        System.out.println( "Start...");
        int firstIntegerValue;
        int secondIntegerValue;
        int sum;
        int difference;
        int product;
        int division;
        int remainder;
        
        Scanner scan = new Scanner ( System.in );
        System.out.println( "Welcome to the worst program you have ever seen!" );
        System.out.print( "Now you have to give us two integer values. Then, we will do some math, understood?" );
        System.out.println( " Good! Let's proceed!" );
        System.out.println( "" );
       
        // User will enter two integer values
        
        System.out.print( "Please enter the first integer value: " );
        firstIntegerValue = scan.nextInt();
        System.out.print( "Now, you have to enter the second integer value: " );
        secondIntegerValue = scan.nextInt();
        System.out.println( "");
        
        // Now we will compute what is asked from us
        
        System.out.println( "Now, math time!" );
        
        sum = firstIntegerValue + secondIntegerValue ;
        difference = firstIntegerValue - secondIntegerValue ;
        product = firstIntegerValue * secondIntegerValue ;
        division = firstIntegerValue / secondIntegerValue ;
        remainder = firstIntegerValue % secondIntegerValue ;
        
        System.out.println( "" );
        System.out.println( "Sum of these integer values is " + sum );
        System.out.println( "Difference of these integers is " + difference ); 
        System.out.println( "Product of these integers is " + product );
        System.out.println( "Division of these integers is " + division + ", and at last, remainder of this division is " + remainder );
        // Just for fun of it :D, and to say goodbye to the user
         
         System.out.println( "" );
         System.out.println( "You like it? No? Me neither, this still needs some more work. Whatever, goodbye!" );
         System.out.println( "End.");
         
         scan.close();
         
    }
}