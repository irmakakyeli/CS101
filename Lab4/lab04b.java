import java.util.Scanner;
/**
 * __loops__
 * @author__Irmak Akyeli__
 * @version__31.10.2018__
 */

public class lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner ( System.in);
      //costants
      int n=6;
      //variables
      int value=0;
      double sum=0;
      int count=0;
      double average=0;
      int min=0;
      int max=0;
      //program code
      
      min = max = value;
      while (count < 100) //n)
      {
         //System.out.print("please enter value;");
         value = scan.nextInt();
         sum=sum+value;
         count=count+1;
         if (value < min)
         { 
            min = value;
         }
         if (value > max)
         { 
            max = value;
         }
      }
      
      average= sum/count;
      
      System.out.println("the sum is: " + sum );
      System.out.println("the count is: " + count);
      System.out.println("the average is: " + average);
      System.out.println("the maximum value is: " + max);
      System.out.println("the minimum value is: " +min);
      System.out.println("done");
   }
}       


//end class    