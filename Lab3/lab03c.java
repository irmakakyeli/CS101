import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;

/**
 * __web page creator___ 
 * @author __Irmak Akyeli___
 * @version __24.10.2018__
 */ 
public class lab03c
{
   public static void main( String[] args) throws FileNotFoundException
      
   {
      Scanner scan = new Scanner( System.in); 
      PrintStream originalStdOut = System.out;
      
      // constants
      
      // variables
      String name;
      int age;
      double grossSalary;
      double netSalary;
      String comment;
      
      // program code
      
      //taking inputs about information
      System.out.print( "The name of the employee is: " );
      name = scan.nextLine();
      
      System.out.print( "The age of the employee is: " );
      age = scan.nextInt();
      
      if ( age<0 )
      {  System.out.println("age must be positive");
      }
      
      System.out.print( "The salary of the employee is: " );
      grossSalary = scan.nextDouble();
      
      if (grossSalary<0)
      {   System.out.println("Salary must be positive");
      }
      
      else if (grossSalary>20000)
      {   System.out.println("Are you sure that the number is correct?");
      }
      
      if (grossSalary<1000)
      { netSalary = grossSalary-(grossSalary-100)*5/100;
      }
      
      else if (1000<grossSalary && grossSalary<5000)
      {netSalary = grossSalary-(grossSalary-100)*15/100;
      }
      
      else
      {   netSalary = grossSalary-(grossSalary-100)*25/100;
      }
      
      System.out.println( "the comment about the employee: " );
      scan.nextLine();
      comment = scan.nextLine();
      
      System.setOut( new PrintStream( "magic.htm" ) );
      
      if (Files.exists( Paths.get( name + ".jpg" ) ))
      {
         
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
         System.out.println(" <img src=\"" +name +".jpg\"> ");
         System.out.print(" <h1>");
         System.out.print( name);
         System.out.println("<h1>");
         System.out.print(" <p>Age: ");
         System.out.print( age);
         System.out.println("</p>");
         System.out.print(" <p>Salary: ");
         System.out.print( netSalary);
         System.out.println("</p>");
         System.out.print(" <p>Comments: ");
         System.out.print( comment);
         System.out.println("</p>");
         System.out.println(" <hr>");
         System.out.println();
         System.out.println(" </body>");
         System.out.println();
         System.out.println(" </html>");
         System.out.close();
         System.setOut( originalStdOut);
         System.out.println( "Webpage created.");
         
      }
      else
      {
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
         System.out.print( netSalary);
         System.out.println("</p>");
         System.out.print(" <p>Comments: ");
         System.out.print( comment);
         System.out.println("</p>");
         System.out.println(" <hr>");
         System.out.println();
         System.out.println(" </body>");
         System.out.println();
         System.out.println(" </html>");
         System.out.close();
         System.setOut( originalStdOut);
         System.out.println( "Webpage created.");
      }
      
      
   }
   
} // end class