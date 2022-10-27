import java.util.Scanner;
import java.lang.Math;

/**
 * __max flower calculator___ 
 * @author __Irmak Akyeli___
 * @version __17.10.2018__
 */ 
public class lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
         double a;
         double b;
         double c;
         double s;
         double rooth;
         double A;
         double numberOfFlowers;
         int num;

      // program code
         //taking inputs about variables
         System.out.println( " the first side length, a " );
         a = scan.nextDouble();
         
         System.out.println( " the second side lenght, b " );
         b = scan.nextDouble();
        
         System.out.println( " the third side lenght, c " );
         c = scan.nextDouble();
         
         //calculating the values
            s = (a + b + c)/2;
            rooth = s * (s - a) * (s - b) * (s - c);
         //takeing square rooth
            A = Math.sqrt(rooth);
            numberOfFlowers = A * 17;
            num = (int) numberOfFlowers;
         
         System.out.print( " Number of Flowers: " );
         System.out.println( num );

   }

} // end class
