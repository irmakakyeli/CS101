import java.util.Scanner;
/**
 * __loops__
 * @author__Irmak Akyeli__
 * @version__31.10.2018__
 */

public class lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner ( System.in);
      //costants
      //variables
      int value=0;
      double sum=0;
      int count=0;
      double average=0;
      int min=1000000000;
      int max=0;
      int stop=0;
      //program code
      
      max = value;
      
      while (stop !=1 ) 
      {
         
         //System.out.print("please enter value;");
         value = scan.nextInt();
         
         if (value > 0 )
         {
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
         else
         { 
            stop=1;
            System.out.println("negative value entered, system has stopped");
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