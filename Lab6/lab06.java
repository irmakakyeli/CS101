import java.util.Scanner;

/**
 * __method madness___ 
 * @author __Irmak Akyeli___
 * @version __14/11/2018__
 */ 

public class lab06
{
   public static double power( double x, int y)
   {
      double result=1;
      for ( int i=0; i < y; i++)
      { 
         result = result * x; 
      }
      return result;
   }
   
   public static double factorial( double n)
   {
      double result=1;
      for( double i=n; i>0; i--)
      {
         result = result * i;
      }
      return result;
   }
   
   public static String reverse( String s)
   {
      for (int a=s.length()-1; a >= 0 ; a--)
         System.out.print(s.charAt(a));
      System.out.println();
      return s;
   }
   

   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      double x;
      int y;
      double n;
      String s;
      
      // program code
      
      System.out.print("please enter the value that you want to multiply: ");
      x = scan.nextDouble();
      System.out.print("please enter the number of times you want to multiply: ");
      y = scan.nextInt();
      
      if ( y > 0)
      {
         System.out.println ( power(x , y) );
         System.out.println();
      }
      else 
         System.out.println("the number of times to multiply cannot be negative");
      
      System.out.print("please enter the value that you want to take factrial of: ");
      n = scan.nextDouble();
      
      if ( n > 0)
         System.out.println (factorial(n));
      else 
         System.out.println("the number which the factorial will be taken cannot be negative");
      
      System.out.print("please enter the word you want to reverse: ");
      s = scan.next();
      System.out.print(reverse(s));
      
      
      
   }
   
}