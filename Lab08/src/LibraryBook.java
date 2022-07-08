/**
 * In this class, we have methods that will help us to loan a book,
 * to unloan a book, to check whether the book is loaned or not, to get how
 * many times it is loaned, to get the due date, and lastly, returns current 
 * book situation.
 * @author Erkin Aydın
 * @version 24/12/2020
 */
public class LibraryBook
{
    // Properties
    
    String title;
    String author;
    String dueDate;
    int timesLoaned;
    
    // Constructor
    
    public LibraryBook( String theTitle , String theAuthor )
    {
        title = theTitle;
        author = theAuthor;
        dueDate = "";
        timesLoaned = 0;
    }
    
    /**
     * Checks whether the book is loaned or not.
     * @return onloan situation
     */
    public boolean onLoan()
    {
        if ( dueDate.equals( "" ) )
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     * sets the due date and loans the book
     * @param newDueDate
     */
    public void loanTheBook( String newDueDate )
    {
        if ( onLoan() == false )
        {
            timesLoaned++;
            dueDate = newDueDate;
        }
        else
        {
            System.out.println ( "This book is already loaned, you can't loan it." );
        }
    }
    
    /**
     * It returns the book back to library.
     */
    public void returnTheBook()
    {
        if ( onLoan() == true )
        {
            dueDate = "";
        }
        else
        {
            System.out.println ( "This book is not loaned, you can't unloan it." );
        }
    }
    
    /**
     * shows how many times loaned the book before
     * @return how many times the book have been loaned
     */
    public int getTimesLoaned()
    {
        return timesLoaned;
    }
    
    /**
     * Checks if titles' are the same
     * @return outputs "true" if properties are the same or "false" if not
     */
    public boolean hasSameTitle( LibraryBook a )
    {
        return ( title == a.title );
    }
    
    /**
     * Checks if authors' are the same
     * @return outputs "true" if properties are the same or "false" if not
     */
    public boolean hasSameAuthor( LibraryBook a )
    {
        return ( author == a.author );
    }
    
    /**
     * Checks if authors' and titles' are the same
     * @return outputs "true" if properties are the same or "false" if not
     */
    public boolean equals( LibraryBook a )
    {
        return ( ( title == a.title ) && ( author == a.author ) );
    }
    
    /**
     * It returns the current book information
     * @return the current book information
     */
    public String toString()
    {
        return "==>[Title: " + title + "-Author: " + author + "-Due Date: " + 
                dueDate + "-Times Loaned: " + timesLoaned + "]";
    }
}