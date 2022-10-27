import java.util.Scanner;

/**
 * __table___ 
 * @author __Irmak Akyeli___
 * @version __07/11/2018__
 */ 
public class lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int row;
      int column;
      int numRow;
      int numColumn;
      int passerToNextColumn=1;
      int numOfSpaces;
      int num=0;
      String first;
      String second;
      String third;
      String forth;
      int number1;
      int number2;
      int number3;
      int number4;
      
      
      // program code
      
      System.out.print("please enter row number: ");
      row = scan.nextInt();
      System.out.print("please enter column number: ");
      column = scan.nextInt();
      
      //table showing row and column numbers
      for ( numRow=1; numRow <= row; numRow++)
      { 
         for ( numColumn=1; numColumn <= column; numColumn++)
         {
         System.out.print( numRow + "," + numColumn);
         passerToNextColumn++;
         first = Integer.toString(numRow);
         second = Integer.toString(numColumn);
         number1 = first.length();
         number2 = second.length();
         for ( numOfSpaces=1; numOfSpaces + number1 + number2 +1 <= 6; numOfSpaces++)
         {System.out.print(" ");
         }
      }
      
      if ( passerToNextColumn== column)
         passerToNextColumn=0;
      System.out.println(); 
      }
      
      System.out.println();
      
      //the table showing product of row and column number
      for   ( numRow=1; numRow <= row; numRow++)
      {
         for ( numColumn=1; numColumn <= column; numColumn++)
         {
         System.out.print( numRow * numColumn);
         passerToNextColumn++;
         third = Integer.toString(numRow*numColumn);
         number3 = third.length();
         for ( numOfSpaces=1; numOfSpaces + number3 <= 6; numOfSpaces++)
         {System.out.print(" ");
         }
      }
      if ( passerToNextColumn == column)
         passerToNextColumn=0;
      System.out.println();
      }
      
      System.out.println();
      
      //table with increasing number
      for   ( numRow=1; numRow <= row; numRow++)
      { 
         for ( numColumn=1; numColumn <= column; numColumn++)
         {
         System.out.print(num);
         passerToNextColumn++;
         forth = Integer.toString(num);
         number4 = forth.length();
         num++;
         for ( numOfSpaces=1; numOfSpaces + number4 <= 6; numOfSpaces++)
         {System.out.print(" ");
         }
      }
      
      if ( passerToNextColumn== column)
         passerToNextColumn=0;
      System.out.println();
      }
      
      System.out.println();
      
      //table showing only the first number in each row
      for   ( numRow=1; numRow <= row; numRow++)
      { 
         for ( numColumn=1; numColumn <= column; numColumn++)
         {
            if (numColumn > 1)
               System.out.print("-");
            else
               System.out.print( numRow );   
         passerToNextColumn++;
         first = Integer.toString(numRow);
         second = Integer.toString(numColumn);
         number1 = first.length();
         number2 = second.length();
         for ( numOfSpaces=1; numOfSpaces +number1 <= 6; numOfSpaces++)
         {System.out.print(" ");
         }
      }
      
      if ( passerToNextColumn== column)
         passerToNextColumn=0;
      System.out.println();
      }
   } 
}