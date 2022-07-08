import java.util.Scanner;
import java.nio.file.*;  

/**
 * __HTML Page With Salary___ 
 * @author __Erkin Aydin___
 * @version __5/11/2020__
 */ 
public class Lab03c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String DOC = "<!DOCTYPE html>";
      final String HTML1 = "<html>";
      final String HTML2 = "</html>";
      final String HEAD1 = "<head>";
      final String HEAD2 = "</head>";
      final String TITLE1 = "<title>";
      final String TITLE2 = "</title>";
      final String BODY1 = "<body>";
      final String BODY2 = "</body>";
      final String HR = "<hr>";
      final String H11 = "<h1>";
      final String H12 = "</h1>";
      final String P1 = "<p>";
      final String P2 = "</p>";
      final String img1 = "<img src=\"einstein.jpg\">"; 

      // variables
      
      String name;
      int age;
      double salary;
      double netSalary;
      String comments;

      // program code
      System.out.print( "<!-- -----------");
      
      System.out.println( "Start...");
      
      System.out.print( "Please enter your name: ");
      name = scan.next(); // If you enter 'Einstein' an image will be created.
      
      System.out.print( "Please enter your age: ");
      age = scan.nextInt();
      if ( age <= 0 )
      {
          System.out.println( "Such age can not exist.");
      }
      else
      {
         System.out.print( "Please enter your salary: ");
         salary = scan.nextDouble();
         if ( salary <= 0 )
         {
            System.out.println( "Such salary can not exist."); 
         }
         else
         {
            if ( 5000 < salary && salary <= 10000 )
            {
                netSalary = ( salary - 100 ) * ( 0.75 );
            }
            else if ( 1000 < salary && salary <= 5000 )
            {
                netSalary = ( salary - 100 ) * ( 0.85 );
            }
            else if ( 0 < salary && salary <= 1000 );
            {
                netSalary = ( salary - 100 ) * ( 0.95 );
            }
         
            System.out.print( "Please enter your comments: ");
            scan.nextLine();
            comments = scan.nextLine();
            System.out.print( " ----------- -->");
         
            String Title = TITLE1 + name + " 's Home Page" + TITLE2;
            String h1 = H11 + name + H12;
            String Age = P1 + "Age: " + age + P2;
            String Salary = P1 + "Salary: " + netSalary + P2;
            String Comments = P1 + "Comments: " + comments + P2;
            if (Files.exists( Paths.get( name + ".jpg" ) ))
            {
            System.out.println( DOC);
            System.out.println( HTML1);
            System.out.println( HEAD1);
            System.out.println( Title);
            System.out.println( HEAD2);
            System.out.println( BODY1);
            System.out.println( HR);
            System.out.print( h1);
            System.out.println(img1);
            System.out.println();
            System.out.print( Age);
            System.out.print( Salary);
            System.out.print( Comments);
            System.out.println( HR);
            System.out.println( BODY2);
            System.out.println( HTML2);
            }
            else
            {
               System.out.println( DOC);
               System.out.println( HTML1);
               System.out.println( HEAD1);
               System.out.println( Title);
               System.out.println( HEAD2);
               System.out.println( BODY1);
               System.out.println( HR);
               System.out.print( h1);
               System.out.println();
               System.out.print( Age);
               System.out.print( Salary);
               System.out.print( Comments);
               System.out.println( HR);
               System.out.println( BODY2);
               System.out.println( HTML2);  
            }
         }
      
         
      }
      
      scan.close();
      
   }

}