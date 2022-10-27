import java.util.Scanner;
import java.text.*;
/**
 * __loops__
 * @author__Irmak Akyeli__
 * @version__31.10.2018__
 */

public class lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner ( System.in);
      //costants
      //variables
      int number1=0;
      int number2=0;
      int number3=0;
      int number4=0;
      int number5=0;
      int number6=0;
      double k=0;
      int n;
      int count=0;
      int count2=0;
      int count3=0;
      int count4=1;
      //program code
      
      
      System.out.print(" please enter the value n:");
      n = scan.nextInt();
      //while loop to output the integer values from 0 up to n exclusive
      if (n<0)
      {System.out.println("please enter a positive integer");
      }
      else
      {
         while ( number1 < n)
         {
            System.out.print( number1 +" ");
            number1 = number1 + 1;
         }
         System.out.println();
         
      //while loop to output the integer values from 0 up to n exclusive with five values per line  
      while ( number2 < n)
      { 
          System.out.print( number2 +" ");
          number2 = number2 +1;
          count= count+1;
          if (count%5 ==0 )
          {
              System.out.println();
          }
       }
      
       System.out.println();
         
         //while loop to output the integer values from n down to 0 inclusive
         number3=n;
         while ( 0 <= number3)
         {    
            System.out.print( number3 +" ");
            number3= number3-1;
         }
         
         System.out.println();
         
         //while loop to output the even values from -n up to n inclusive
         number4=-n ; 
         while (number4>=-n && number4<=n )
         {  if (number4%2==0)
             {   
                System.out.print( number4 +" "); 
             }
            number4= number4+1;
         }
         
         System.out.println();
         System.out.println();
         
         //while loop that outputs the squares of the even values from 0 up to n inclusive
         while ( number5 < n)
         { 
            if (number5%2==0){
               System.out.print( number5*number5 +" ");
               count2= count2+1;
               if (count2%5 ==0 )
               {
                  System.out.println(" ");
               }
            }
            number5= number5+1;
         }
         
         System.out.println();
         
         // while loop that outputs the values which are divisible by 3 or 4, but not both
         number6=n;
         while (number6>=0 && number6<=n)
            {number6=number6-1;
            if (number6%3==0 || number6%4==0)
            {
               if (number6%12!=0)
               {
                  System.out.print( number6 +" ");
                  count3= count3+1;
               }
            }
            if (count3%5==0)
            {
               System.out.println(" ");  
            }
         }
         
         //while loop that outputs all of the divisors of n
         while (count4<=n )
         {
            count4=count4+1; 
            if (n%count4==0)
            {
               System.out.print( count4 + " " ); 
            }
         }
         
         System.out.println();
         
         //while loop that, for every integer k from n down to 1, outputs the values of 1 / k
         k=n;
         while (k<=n && k>=1)
         {
            NumberFormat formatter = new DecimalFormat("#0.00");     
            System.out.print(formatter.format(1/k) + "; ");
            k=k-1;  
         }
         
         System.out.println();
         System.out.println("done");
      }
   }       
   
} //end class    