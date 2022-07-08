package Lab07b;
/**
 * Lab07b Modified: Here we create 5 different books. First we loan them, then
 * we unloan them and print their current situation in each step.
 * @author Erkin Aydın
 * @version 17/12/2020
 */
public class TestLibraryBook
{
    public static void main ( String[] args )
    {
        
        // Constants
        
        final String LINE ="======================================================>";
        
        // Here I defined 5 different books bot our experiment.
        LibraryBook book1 = new LibraryBook ( "Calculus, Metric Version" , "James Stewart" );
        LibraryBook book2 = new LibraryBook ( "1984" , "George Orwell" );
        LibraryBook book3 = new LibraryBook ( "Homo Sapiens" , "Yual Noah Harari" );
        LibraryBook book4 = new LibraryBook ( "Also Sprach Zarathustra" , "Friedrich Nietzsche" );
        LibraryBook book5 = new LibraryBook ( "The Selfish Gene" , "Richard Dawkins" );
        
        // Here we first print the original condition of the books before any loaning.
        System.out.println ( LINE );
        System.out.println ( book1 );
        System.out.println ( book2 );
        System.out.println ( book3 );
        System.out.println ( book4 );
        System.out.println ( book5 );
        System.out.println( LINE );
        
        /* Now we loan the book by simply entering the due date. It will not
        give any error since none of the books are not loaned at the moment */
        System.out.println( LINE );
        book1.loanBook ( "08/01/2021" );
        book2.loanBook ( "25/07/2021" );
        book3.loanBook ( "27/07/2021" );
        book4.loanBook ( "31/10/2021" );
        book5.loanBook ( "07/10/2021" );
        System.out.println( LINE );
        
        // We print the current book information while books are on loan.
        System.out.println( LINE );
        System.out.println ( "Current Book Information: " + book1.toString() );
        System.out.println ( "Current Book Information: " + book2.toString() );
        System.out.println ( "Current Book Information: " + book3.toString() );
        System.out.println ( "Current Book Information: " + book4.toString() );
        System.out.println ( "Current Book Information: " + book5.toString() );
        System.out.println( LINE );
        
        // Here, it will give errors because books are already loaned.
        System.out.println( LINE );
        book1.loanBook ( "09/01/2021" );
        book2.loanBook ( "26/07/2021" );
        book3.loanBook ( "28/07/2021" );
        book4.loanBook ( "01/11/2021" );
        book5.loanBook ( "08/10/2021" );
        System.out.println( LINE );
        
        /* Now, we bring an end to our loan. We simply give books back
        to library */
        book1.endLoan();
        book2.endLoan();
        book3.endLoan();
        book4.endLoan();
        book5.endLoan();
        
        /* We print the book information. At the moment, there are no books loaned, so due date
        should be null */
        System.out.println( LINE );
        System.out.println( "Current Book Information: " + book1.toString() );
        System.out.println( "Current Book Information: " + book2.toString() );
        System.out.println( "Current Book Information: " + book3.toString() );
        System.out.println( "Current Book Information: " + book4.toString() );
        System.out.println( "Current Book Information: " + book5.toString() );
        System.out.println( LINE );
        
        System.out.println();
        System.out.println( "Lab07b Modified Version Done!" );
    }
}
