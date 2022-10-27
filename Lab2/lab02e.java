import java.util.Scanner;

/**
 * __web page creator___ 
 * @author __Irmak Akyeli___
 * @version __17.10.2018__
 */ 
public class lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
         String name;
         int age;
         double salary;
         String comment;

      // program code
         
         //taking inputs about information
         //System.out.print( "The name of the employee is: " );
         name = scan.nextLine();
         
         //System.out.print( "The age of the employee is: " );
         age = scan.nextInt();
         
         //System.out.print( "The salary of the employee is: " );
         salary = scan.nextDouble();
         
         //System.out.println( "the comment about the employee: " );
         scan.nextLine();
         comment = scan.nextLine();
         
         //recreating the html page
         System.out.println();
         System.out.println( " <!DOCTYPE html>");
         System.out.println();
         System.out.println(" <html>");
         System.out.println();
         System.out.println(" <head>");
         System.out.print(" <title>");
         System.out.print( name);
         System.out.println("'s Home Page</title>");
         System.out.println(" </head>");
         System.out.println();
         System.out.println(" <body>");
         System.out.println();
         System.out.println(" <hr>");
         System.out.print(" <h1>");
         System.out.print( name);
         System.out.println("<h1>");
         System.out.print(" <p>Age: ");
         System.out.print( age);
         System.out.println("</p>");
         System.out.print(" <p>Salary: ");
         System.out.print( salary);
         System.out.println("</p>");
         System.out.print(" <p>Comments: ");
         System.out.print( comment);
         System.out.println("</p>");
         System.out.println(" <hr>");
         System.out.println();
         System.out.println(" </body>");
         System.out.println();
         System.out.println(" </html>");
                               
         
         
   }

} // end class