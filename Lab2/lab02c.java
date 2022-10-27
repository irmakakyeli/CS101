import java.util.Scanner;

/**
 * __program description___ 
 * @author __Irmak Akyeli___
 * @version __17,10,2018__
 */ 
public class lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
         int x;
         int y;
         int sum;
         int difference;
         int product;
         int division;
         int remaining;

      // program code
         
      //taking inputs about variables
      System.out.println( "Start...");
      System.out.println( " the first value, x");
         x = scan.nextInt();
      
      System.out.println( " the second value, y");
         y = scan.nextInt();
         
         //calculating the results
         sum = x + y;
         difference = x - y;
         product = x * y;
         division = x / y;
         remaining = x % y;
         
      //giving the results   
         
      System.out.print( "The sum is ");
      System.out.println ( sum);
      System.out.print( "The difference is ");
      System.out.println( difference);
      System.out.print( "The product is ");
      System.out.println( product);
      System.out.print( "The division is ");
      System.out.println( division);
      System.out.print( "The remaining from division is ");
      System.out.println( remaining);
      System.out.println();
      System.out.println( "End.");
   }

} // end class