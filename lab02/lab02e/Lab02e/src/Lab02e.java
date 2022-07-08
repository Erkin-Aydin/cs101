import java.util.Scanner;

/**
 * __HTML Page___ 
 * @author __Erkin Aydin___
 * @version __30/10/2020__
 */ 
public class Lab02e
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
       

      // variables
      
      String name;
      int age;
      double salary;
      String comments;

      // program code
      System.out.print( "<!-- -----------");
      
      System.out.println( "Start...");
      
      System.out.print( "Please enter your name: ");
      name = scan.next();
      
      System.out.print( "Please enter your age: ");
      age = scan.nextInt();
      
      System.out.print( "Please enter your salary: ");
      salary = scan.nextDouble();
      
      System.out.print( "Please enter your comments: ");
      scan.nextLine();
      comments = scan.nextLine();
      System.out.print( " ----------- -->");
      
      String Title = TITLE1 + name + " 's Home Page" + TITLE2;
      String h1 = H11 + name + H12;
      String Age = P1 + "Age: " + age + P2;
      String Salary = P1 + "Salary: " + salary + P2;
      String Comments = P1 + "Comments: " + comments + P2;
      
      System.out.println( DOC);
      System.out.println( HTML1);
      System.out.println( HEAD1);
      System.out.println( Title);
      System.out.println( HEAD2);
      System.out.println( BODY1);
      System.out.println( HR);
      System.out.print( h1);
      System.out.print( Age);
      System.out.print( Salary);
      System.out.print( Comments);
      System.out.println( HR);
      System.out.println( BODY2);
      System.out.println( HTML2);
      
      scan.close();
   }

}