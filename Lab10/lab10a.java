import java.util.Scanner;

/**
 * __BigNum Test___ 
 * @author __Irmak Akyeli___
 * @version __26/12/2018__
 */ 
public class lab10a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      BigNum b5;
      BigNum b6;
      
      // program code
      b1 = new BigNum();
      b2 = new BigNum("123456");
      b3 = new BigNum(b2);
      b4 = new BigNum("123");
      b5 = new BigNum("1234");
      b6 = new BigNum("12345");
      
      
      System.out.println("b1 = " + b1.toString());
      System.out.println("b2 = " + b2.toString());
      System.out.println("b3 the clone of b2 = " + b3.toString());
      System.out.println("b2 equals b3? " + b2.equals(b3));
      System.out.println("b2 equals b6? " +b2.equals(b6));
      System.out.println("b4 is zero? " + b4.isZero(b4));
      System.out.println(b6.add(b2));
      b2.shift(true);
      b2.shift(false);
      
   }
}