import java.util.Scanner;

/**
 * __calculator___ 
 * @author __Irmak Akyeli___
 * @version __07/11/2018__
 */ 
public class lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      double value=0;
      //secondvalue is for keeping the first one in memory
      double secondvalue=0;
      String operation;
      
      // program code
      
      System.out.println("welcome to \"SimpleCalc\"...");
      operation =" ";
      
      while (!operation.equals("Quit"))
      {
         System.out.println("----------------");
         System.out.println("[" + value + "]");
         System.out.println("----------------");
         //for hiding the messega of value in case the user wants to clear or quit
         System.out.print("select an operation:+ - / * or Clear/Quit ");
         operation = scan.next();
         if (!operation.equals("Clear"))
         {
            if (!operation.equals("Quit"))
            {
            System.out.print("enter the value you want: ");
            secondvalue = scan.nextDouble();
            }
         }
         System.out.println("----------------");
         if      (operation.equals("+"))
            value=value+secondvalue;
         else if (operation.equals("-"))
            value=value-secondvalue;
         else if (operation.equals("*"))
            value=value*secondvalue;
         else if (operation.equals("/"))
            value=value/secondvalue;
         else if (operation.equals("Clear"))
            value=0;
         else if (operation.equals("Quit"))
            System.out.println("Thanks for using \"SimpleCalc\", goodbye.");
         //error in case the operator entered does not exist in the list
         else
            System.out.println("invalid enter");
      }
   }
}