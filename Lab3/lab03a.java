import java.util.Scanner;

/**
 * __lister___ 
 * @author __Irmak Akyeli___
 * @version __24.10.2018__
 */ 
public class lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int n;
      int sum = 0;
      int formula;
      int even = 0;
      int odd = 0;
      
      
      // program code
      
      System.out.print(" Please Enter n:");
      n = scan.nextInt();
      
      for ( int x = 0; x <= 50; x++ ) 
         
      {  
         if ( x>=12 && x<=25)
         {  
            System.out.println( x);
         }
         else
         {
            System.out.println( "out of range 12-25" );
         }
         
         
         System.out.println( x);
         if (x%5==0)
         {   System.out.println(" Hi Five");
         }
         else if ( x%2==0)
         {   System.out.println(" Hi Two");
         }
         else if (x%3==0 || x%7==0)
         {   System.out.println(" Hi Three Or Seven");
         }
         else 
         {   System.out.println(" Hi Others!");
         }
         if (x%2==0)
         { even++;
         }
         else 
         { odd++;
         }
         
         if (n<50)
         {  
            
            if(0<=x && x<=n) 
            {
               sum += x; 
               System.out.println( sum);
               formula = n*(n+1)/2;
               System.out.println( formula);
               
               if ( sum == formula)
               { System.out.println( "They Are The Same!");
               }
               else 
               { System.out.println( "They Are Not The Same");
               }
            }
         }
         else 
         {  System.out.println(" N out of range, please choose between 1 and 50");
            
         }
      }
      System.out.println( "The number of even numbers" + even);
      System.out.println( "The number of even numbers" + odd);
      
      System.out.println();
      
      
   }
   
} // end class