import java.util.Scanner;

/**
 * Application of Library.java. It creates an user interface and shows his/her/their options, and then
 * applies them.
 * @author Erkin Aydın
 * @version 24/12/2020
 */

public class LibraryTest
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        
        // Constants
        
        final String LINE = "<================================================="
                            + "================================================>";
        
        // Variables
        
        String inputString1;
        String inputString2;
        String newBookTitle;
        String newBookAuthor;
        String dueDate;
        Library theLibrary;
        
        System.out.println( "Welcome to our great library!" );
        
        theLibrary = new Library();
        do
        {
            // First User Interface
            System.out.println( "Time to choose!" );
            System.out.println( LINE );
            System.out.println( "-->Add" );
            System.out.println( "-->Show" );
            System.out.println( "-->Find" );
            System.out.println( "-->Exit" );
            System.out.println( LINE );
            System.out.print( "What will you do: " );
            inputString1 = scan.nextLine();
            
            // Here we add a new book to the library
            if( inputString1.equals( "Add" ) )
            {
                // We ask the title of the book
                System.out.print( "=>Enter the title of the book you want to add: " );
                newBookTitle = scan.nextLine();
                
                // We ask the author's name
                System.out.print( "=>Now, enter the name of the author of the book: " );
                newBookAuthor = scan.nextLine();
                
                // And finally, we add it to the library
                theLibrary.add( newBookTitle , newBookAuthor );
                System.out.println( "Alright, it is done!" );
            }
            
            // Here we show a spesific book
            else if( inputString1.equals( "Show" ) )
            {
                // Here we check whether there are any books in the library
                if( theLibrary.isEmpty() )
                {
                    System.out.println( "Sorry, there are no books in this library." );
                }
                
                // If there are books in the library, we try to find and show it
                else
                {
                    System.out.print( "Enter the title of the book you want to find: " );
                    newBookTitle = scan.nextLine();
                    System.out.println( "Let's see..." );
                    System.out.println( theLibrary.findByTitle( newBookTitle ) );
                }
            }
            
            /* Here we find the requested book and loan it, return it, remove it or simply exit 
            from "Find" category */
            else if( inputString1.equals( "Find" ) )
            {
                inputString2 = "";
                    System.out.print( "Enter the title of the book you want to find: " );
                    newBookTitle = scan.nextLine();
                    
                // We check whether such book exists
                if( theLibrary.findByTitle( newBookTitle ) != null )
                {
                    // Second User Interface=> For Find Choice
                    System.out.println( LINE );
                    System.out.println( "OK, this is the book: " + theLibrary.findByTitle( newBookTitle ) );
                    System.out.println( "What would you like to do with it?" );
                    System.out.println( LINE );
                    System.out.println( "=>Loan it" );
                    System.out.println( "=>Return it" );
                    System.out.println( "=>Remove it" );
                    System.out.println( "=>Exit" );
                    System.out.println( LINE );
                    System.out.print( "Choose: " );
                    inputString2 = scan.nextLine();
                    
                    // We have to make sure the inputted command actually exists.
                    if( !inputString2.equals( "Loan it" ) && !inputString2.equals( "Return it" ) && 
                        !inputString2.equals( "Remove it" ) && !inputString2.equals( "Exit" ) )
                    {
                        // It will ask the user to enter a valid command until he/she/they does/do.
                        do
                        {
                            System.out.print( "Unknown command. Please try again: " );
                            inputString2 = scan.nextLine();
                        } while ( !inputString2.equals( "Loan it" ) && !inputString2.equals( "Return it" ) && 
                                !inputString2.equals( "Remove it" ) && !inputString2.equals( "Exit" ) );
                    }
                    
                    // We loan the book here.
                    if( inputString2.equals( "Loan it" ) )
                    {
                        // A book is only can be loaned if it is not loaned alreaady
                        if( !theLibrary.findByTitle( newBookTitle ).onLoan() )
                        {
                            // We ask the due date, and then loan the book in the name of user
                            System.out.print( "OK, when will you return it? => " );
                            dueDate = scan.next();
                            theLibrary.findByTitle( newBookTitle ).loanTheBook( dueDate );
                            System.out.println( "The book you loaned is " + theLibrary.findByTitle( newBookTitle ) );
                            System.out.println( LINE );
                        }
                        
                        // If it is already loaned, we print an error message
                        else
                        {
                            System.out.println( "Sorry, this book is already loaned!" );
                            System.out.println( LINE );
                        }
                    }
                    
                    // We return the book here
                    else if( inputString2.equals( "Return it" ) )
                    {
                        // A book can only be returned if it is loaned. We check it first
                        if( theLibrary.findByTitle( newBookTitle ).onLoan() )
                        {
                            theLibrary.findByTitle( newBookTitle ).returnTheBook();
                            System.out.println( "OK, it is returned." );
                            System.out.println( LINE );
                        }
                        
                        // If it is already in the library, we can't return it. We print an error message.
                        else
                        {
                            System.out.println( "This book is currently in the library." );
                            System.out.println( LINE );
                        }
                    }
                    
                    // It doesn't matter whether it is loaned or not. We delete the book from the library system
                    else if( inputString2.equals( "Remove it" ) )
                    {
                        theLibrary.remove( theLibrary.findByTitle( newBookTitle ) );
                        System.out.println( "OK, it is removed." );
                    }
                }
            }    
        } while ( !inputString1.equals( "Exit" ) );
        System.out.println( LINE );
        System.out.println( "Come back again. Goodbye!" );
        
        scan.close();
    }
}
