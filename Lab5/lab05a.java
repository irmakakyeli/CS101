import java.util.Scanner;

/**
 * __rectangular patterns___ 
 * @author __Irmak Akyeli___
 * @version __07/11/2018__
 */ 
public class lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int height;
      int width;
      int thickness;
      int restart=1;
      String yes;
      
      // program code
      while (restart ==1)
      {
         System.out.print("please enter height: ");
         height = scan.nextInt();
         System.out.print("please enter width: ");
         width = scan.nextInt();
         System.out.print("please enter thickness: ");
         
         thickness = scan.nextInt();
         if ( height > 0 && width > 0 && thickness > 0 )
         { 
            //for being sure that their is a hole doing another if condition
            if ( height - thickness * 2 > 0 || width - thickness * 2 > 0)
            {
               for ( int number1=0; number1 < thickness; number1++)
               {
                  for ( int number2=0; number2 < width; number2++) 
                     System.out.print("*");
                  System.out.println();
               }
               
               for ( int number3=0; number3 < height - thickness * 2; number3++)
               {
                  for ( int number4=0; number4 < thickness; number4++)
                     System.out.print("*");
                  for ( int number5=0; number5 < width - thickness * 2; number5++)
                     System.out.print(" ");
                  for ( int number6=0; number6 < thickness; number6++)
                     System.out.print("*");
                  System.out.println();
               }
               
               for ( int number1=0; number1 < thickness; number1++)
               {
                  for ( int number2=0; number2 < width; number2++) 
                     System.out.print("*");
                  System.out.println();
               }  
            }
            //error if there is no hole
            else
            {
               for ( int number7=0; number7 < width; number7++)
               {
                  System.out.print("*");
                  
                  for ( int number8=0; number8 < height; number8++)
                     System.out.print("*"); 
                  System.out.println();
               }
               System.out.println("oops.. no hole!");
               System.out.println("please enter other values");
            }
         }
         //error if value is negative
         else 
            System.out.println("please enter only positive values!");
         
         System.out.println("do you wish to create another pattern?");
         System.out.print("type y if you want to:");
         yes = scan.next();
         
         if(yes.equals("y"))
            restart=1;
         else
         {
            restart=0;
            System.out.println("goodbye!");
         }
      }
   }
}