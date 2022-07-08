import java.util.ArrayList;

/**
 * Here we created an artificial library and methods to add books to library, show the current book information, 
 * find the book and loan-return-remove it and exit the library.
 * @author Erkin Aydın
 * @version 24/12/2020
 */

public class Library
{
    // Properties
    
    ArrayList <LibraryBook> ourLibrary;
    
    // Constructor
    
    public Library()
    {
        ourLibrary = new ArrayList <LibraryBook>();
    }
    
    // Methods
    
    /**
     * Checks whether there are any books on the library or not.
     */
    public boolean isEmpty()
    {
        return ourLibrary.size() == 0;
    }
    
    /**
     * Simply converts Library to String.
     */
    public String toString()
    {
        // First, we check whether there are any books on the library
        if( isEmpty() )
        {
            return "Sorry, there are no books in this library.";
        }
        else
        {
            return ourLibrary.toString();
        }
    }
    
    /**
     * This will add a new book with the given title name and the author name
     * @param theTitle of the book and theAuthor of the book. 
     */
    public void add( String theTitle , String theAuthor )
    {
        // Here, we create a new book with given parameters, and then, add it to the library.
        LibraryBook newBook;
        newBook = new LibraryBook( theTitle , theAuthor );
        ourLibrary.add( newBook );
    }
    
    /**
     * Simply returns the loaned book to the library
     * @param the book that we will return to the library
     */
    public boolean remove( LibraryBook theReturnBook )
    {
        // Variables
        
        boolean exists;
        int indexNumber;
        int sizeNumber;
        
        //Initialization part
        
        exists = false;
        indexNumber = ourLibrary.indexOf( theReturnBook );
        if( indexNumber == -1 ) // If such book does not exist, it will print an error message
        {
            System.out.println( "Sorry, we couldn't find this book." );
        }
        
        // If such book exists, it will remove it from the library
        else 
        {
            ourLibrary.remove( indexNumber );
            exists = true;
        }
        return exists;
        
        /* Another way of doing this:
        indexNumber = -1;
        sizeNumber = 0;
        exists = false;
        
        while( sizeNumber != ourLibrary.size() && exists == false )
        {
            indexNumber++;
            sizeNumber++;
            if( theReturnBook.title.equals( ourLibrary.get( indexNumber ).title ) )
            {
                ourLibrary.remove( indexNumber );
                exists = true;
            }
        }
        
        return exists;
        */
    }
    
    /**
     * Finds the book if a book with the given title exists.
     * @param title of the searched book
     */
    public LibraryBook findByTitle( String theInputTitle )
    {
        // Variables
        
        int indexNumber;
        int sizeNumber;
        boolean exists;
        
        // Initialization part
        
        exists = false;
        sizeNumber = 0;
        indexNumber = 0;
        
        /* Here it will escape the while loop if suck book is found or every book is checked
        but no book with the given title found */
        while ( exists == false && indexNumber < ourLibrary.size() )
        {
            // If such book is found, we set its condition to exists == true.
            if( theInputTitle.equals( ourLibrary.get( indexNumber ).title ) )
            {
                exists = true;
            }
            indexNumber++;
        }
        
        // If the book does not exist but other books does, it will return null.
        if( exists == false )
        {
            return null;
        }
        
        /* If there are no books in this library, it will print an error message and return null.
        NOTE: I didn't use this part efficiently in LibraryTest.java */
        else if( ourLibrary.size() == 0 )
        {
            System.out.println( "There are no books in this library." );
            return null;
        }
        
        // If such book exists, it will return that book.
        else
        {
            return ourLibrary.get( indexNumber - 1 );
        }
    }
}
