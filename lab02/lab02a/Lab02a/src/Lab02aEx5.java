import java.util.Scanner;

/**
 *  __exercise 5___
 * @author __Erkin Aydın___
 * @version __28/10/2002__
 */
public class Lab02aEx5
{
    public static void main(String[] args)
    {
        
        // constants
        
        // variables
        String yourName;
        // code
        System.out.println( "Start...");
        Scanner scan = new Scanner ( System.in );
        System.out.print("Welcome... Um... what was your name?: ");
        yourName = scan.nextLine();
        System.out.println( "" );
        System.out.print("Oh right, your name is " + yourName + ", welcome to java " + yourName + "!" );
        System.out.println("");
        System.out.println( "End.");
        scan.close();
      
    }
}        