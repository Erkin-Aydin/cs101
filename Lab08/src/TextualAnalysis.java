import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program will read a file, then compute the longest words length, most frequent
 * word length and every words length and frequency.
 * @author Erkin Aydın
 * @version 24/12/2020
*/

public class TextualAnalysis
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner( new File( "Text.txt" ) );
        
        // Declaring an ArrayList of "Integers".
        ArrayList<Integer> list;
        
        // Variables
        int maxLength;
        int count;
        int frequency;
        int mostFrequentNumber;
        
        // Initiation part
        list = new ArrayList<>(); //We initialize an array list.
        maxLength = 0;
        frequency = 0;
        mostFrequentNumber = 0;
        
        // Here, we get the next string untill we ran out of it.
        while ( scan.hasNext() )
        {
            String s;
            s = scan.next();
            list.add( s.length() );
        }
        
        // Here, we find the largest length of words.
        for ( Integer i : list )
        {
            if ( i > maxLength )
            {
                maxLength = i;
            }
        }
        
        // Here, we print every occuring length ant its frequency
        for ( int i = 1; i <= maxLength; i++ )
        {
            // This is the part we compute each word length's frequency
            count = 0;
            for ( Integer j : list )
            {
                if ( j == i )
                {
                    count = count + 1;
                }
            }
            
            // We compute the biggest frequentcy
            if ( count > frequency )
            {
                frequency = count;
                mostFrequentNumber = i;
            }
            System.out.println( count + " words of length " + i );
        }
        System.out.println( "The longest words length is==> " + maxLength );
        System.out.println( "The most frequently occuring word length is " + mostFrequentNumber 
                            + ", which occurs " + frequency + " times." );
        
        scan.close();
    }
}