import java.util.Scanner;
/**
 * __loops__
 * @author__Irmak Akyeli__
 * @version__31.10.2018__
 */

public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner ( System.in);
      
      //constants
      
      //variables
      char ch;
      int width;
      int row=1;
      int column=1;
      double d=0.1;
      
      //program code
      System.out.print("please enter the character you want to use: ");
      ch = scan.next().charAt(0);
      System.out.print("please enter the width you want to have: ");
      width = scan.nextInt();
      
      while ( column <= width )
      {
         while ( row <= column)
         {
            System.out.print( ch );
            row++;
         }
         System.out.print("\n");
         column++;
         row = 1;
      }
      
      while ( d < 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
   }       
   
} //end class    