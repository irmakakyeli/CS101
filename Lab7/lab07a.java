import java.util.Scanner;

/**
 * __Dice Games___ 
 * @author __Irmak Akyeli___
 * @version __5/12/2018__
 */ 
public class lab07a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int counter=0;
      int counter2=0;
      int dice;
      int age;
      // program code
      age = scan.nextInt();
      while(counter < 2)
      {
         dice = (int)(Math.random()*6.0 + 1);
         counter2++;
         if (dice == 6)
         {
            counter++;
         }
         
      }
      System.out.println("the number of rools: " + counter2);
      
      
   }

}
