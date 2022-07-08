package Lab07b;
/**
 * In this class, we have methots that will help us loan the book, unloan the book,
 * check whether the book is on loan, get how many times it is loaned, get the 
 * due date, and lastly, returns current book situation/information.
 * @author Erkin Aydın
 * @version 17/12/2002
 */
public class LibraryBook {

    // Properties
    String title;
    String author;
    String dueDate;
    int timesLoaned;

    /**
     * Constructor of the LibraryBook class
     * initializes the properties
     * @param title of the book 
     * @param author of the book
     */
    public LibraryBook( String theTitle, String theAuthor )
    {    
        title = theTitle;
        author = theAuthor;
        dueDate = null;
        timesLoaned = 0;

    }
    
    /**
     * shows whether the book is on loan or not
     * @return onLoan info
     */
    public boolean onLoan()
    {

        if ( dueDate == null )
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
     * @param dueDate
     */
    public void loanBook( String theDueDate )
    {
        if ( onLoan() == false )
        {
            System.out.println( "You have just loaned this book: " + title + "-" + author );
            dueDate = theDueDate;
            timesLoaned++;
        }
        else
        {
            System.out.println( "This book is already loaned, sorry!" );
        }
    }

    /**
     * shows how many times loaned the book before
     * @return
     */
    public int getTimesLoaned()
    {
        return timesLoaned;
    }

    /**
     * It ends loan, gives the book back to library, by setting due date to null.
     */
    public void endLoan()
    {
        this.dueDate = null;
    }

    /**
     * It will return the due date.
     * @return the due date
     */
    public String getDueDate()
    {
        return dueDate;
    }
    /**
     * It returns the current book information
     * @return the current book information
     */
    public String toString()
    {
        String bookInfo = "[Title: " + title + ", Author: " + author 
          + ", Due Date: " + dueDate + ", Times Loaned: " + timesLoaned + "]";
        return bookInfo;
      }
}