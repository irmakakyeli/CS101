import java.util.Scanner;

/**
 * __Lots of BigNum___ 
 * @author __Irmak Akyeli___
 * @version __26/12/2018__
 */ 
public class lab10b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int n = 10;
      
      // variables
      BigNum[] list;
      String s;
      int command;
      int index;
      BigNum maxNum;
      BigNum bigNum;
      
      // program code
      
      list = new BigNum[n];
      maxNum = new BigNum();
      bigNum = new BigNum();
      
      for(int i=0; i < n; i++)
      {
         s = "";
         for(int j=0; j < BigNum.SIZE; j++)
         {
            s = s + (int)(Math.random() * BigNum.BASE);
         }
         list[i] = new BigNum(s);
         System.out.println("Big numbers created: " + i + ": " + list[i].toString());
      }
      
      do 
      {
         command = scan.nextInt();
         if(command > n)
            System.out.println("you should enter integer values up to " + n + "inclusive");
         else if (command != 0)
         {
            index = 0;
            
            for(int i=1; i < command; i++)
            {
               System.out.println(list[index].isLessThan(list[i]));
               if(list[index].isLessThan(list[i]))
                  index = i;
               System.out.println(index); 
            }
            maxNum.bignum = list[index].bignum.clone();
            list[command - 1].bignum = maxNum.bignum.clone();
            list[index].bignum = bigNum.bignum.clone();
            for(int i=0; i < n; i++)
            {
               System.out.println("BigNum at index: " + i + ": " + list[i].toString());
            }  
         }
      } while (command != 0);
      System.out.println("End");   
   }
}
