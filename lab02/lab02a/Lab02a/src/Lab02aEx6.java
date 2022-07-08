import java.util.Scanner;

/**
 *  __exercise 6___
 * @author __Erkin Aydın___
 * @version __28/10/2002__
 */
public class Lab02aEx6
{
    public static void main(String[] args)
    {
        
        // constants
        
        // variables
        
        String yourName;
        int age;
        
        // code
        System.out.println( "Start...");
        Scanner scan = new Scanner ( System.in );
        System.out.print( "Hi! Let's be friends! What is your name?: " );
        yourName = scan.nextLine();
        System.out.println( "" );
        
        System.out.print( "And how old are you " + yourName + "?: " );
        age = scan.nextInt();
        System.out.println( "" );
        
        // Time to print what we asked before
        
        System.out.println( "Great! So, your name is " + yourName + " and you are " + age + " years old. Nice to meet you!" );
        System.out.println( "" );
        
        // Time to say goodbye!
        
        System.out.println( "Goodbye " + yourName + "!" );
        System.out.println( "" );
        System.out.println( "End.");
        
        scan.close();
      
    }
}  