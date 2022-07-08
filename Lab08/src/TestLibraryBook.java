/**
 * In this program, we create 3 books. One happens to be a copy of another.
 * We loan-return them, and try to understand the 'difference' between == and .equals()
 * @author Erkin Aydın
 * @version 24/12/2020
 */

public class TestLibraryBook
{
    public static void main ( String[] args )
    {
        // Constants
        
        final String LINE = "=================================================" + 
                            "=================================================>";
        
        // Variables
        LibraryBook book1;
        LibraryBook book2;
        LibraryBook bookReference1;
        LibraryBook bookCopy1;
        
        // Obejcts = Books
        
        book1 = new LibraryBook ( "1984" , "George Orwell" );
        bookCopy1 = new LibraryBook ( "1984" , "George Orwell" );
        bookReference1 = book1;
        book2 = new LibraryBook ( "The Selfish Gene" , "Richard Dawkins" );
        
        System.out.println( LINE );
        System.out.println ( "First Book" + book1 );
        System.out.println ( "Second Book" + book2 );
        System.out.println( LINE );
        
        // We loan books
        book1.loanTheBook( "07/10/2021" );
        book2.loanTheBook( "14/11/2021" );
        
        System.out.println( LINE );
        System.out.println ( "First Book" + book1 );
        System.out.println ( "Second Book" + book2 );
        System.out.println( LINE );
        
        // We try to loan the same books again
        System.out.println( LINE );
        book1.loanTheBook( "07/10/2021" );
        book2.loanTheBook( "14/11/2021" );
        System.out.println( LINE );
        
        // We return books
        book1.returnTheBook();
        book2.returnTheBook();
        
        System.out.println( LINE );
        System.out.println ( "First Book" + book1 );
        System.out.println ( "Second Book" + book2 );
        System.out.println( LINE );
        
        // We try to return the same books again
        System.out.println( LINE );
        book1.returnTheBook();
        book2.returnTheBook();
        System.out.println( LINE );
        
        // (a)two references to a single object:
        System.out.println( LINE );
        System.out.println( book1 == bookReference1 );
        System.out.println( book1.equals( bookReference1 ) );
        System.out.println( LINE );
        
        // (b) two references to two individual objects with different properties:
        System.out.println( book1 == book2 );
        System.out.println( book1.equals( book2 ) );
        System.out.println( LINE );
        
        // (c) two references to two individual objects with identical relevant properties:
        System.out.println( book1 == bookCopy1 );
        System.out.println( book1.equals( bookCopy1 ) );
        System.out.println( LINE );
        
        /* Explaination: In default, if both objects we use in .equals() are the same type,
        then there is no functional difference between .equals() and ==, they both look 
        for references. If not, then .equals() is not the same with ==, it looks to properties. */
        
        System.out.println ( "Lab07b Done!!!" );
    }
}