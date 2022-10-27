/**
 * Little Big Numbers
 */
public class BigNum 
{
   //constants
   public final static int SIZE = 8;
   public final static int BASE = 10;
   
   // properties
   int[] bignum;   
   
   // constructors
   public BigNum()
   {
      bignum = new int[SIZE];
   }
   
   public BigNum(String number)
   {
      bignum = new int[SIZE];
      for (int i=0; i < number.length(); i++)
      {
         bignum[number.length() - 1 - i] = Character.getNumericValue(number.charAt(i));
      }
   }
   
   public BigNum(BigNum num)
   {
      this.bignum = num.bignum;
   }
   
   // methods
   
   /**
   * Returns String that shows user the array of BigNums
   * @ return String
   */
   public String toString( )
   {
      String print="[";
      for(int i=0; i < SIZE; i++)
      {
         if (i != SIZE - 1)
            print = print + bignum[i] + ",";
         else 
            print = print + bignum[i] + "]";
      }
      return print;
   }
   
   /**
   * returns booleann which evaluates if two BigNums are identical or not.
   * @ param BigNum
   * @ return boolean
   */
   public boolean equals(BigNum b)
   {
      for(int i=0; i < SIZE; i++)
      {
         if (this.bignum[i] != b.bignum[i])
            return false;
      }
      return true;
   }
   
   /**
   * Returns boolean evaluates if BigNum is empty
   * @ return boolean
   */
   public boolean isZero(BigNum other)
   {
      for(int i=0; i < SIZE; i++)
      {
         if (this.bignum[i] != 0)
            return false;
      }
      return true;
   }
   
   /**
   * Shift the number left or right
   */
   //as when we multiply or divide a number by its base it wil only add a 0 at the end ore delete one 
   //that is why we dont need to evaluate looking at their base and could only shift them directly
    public void shift(boolean left)
   {
      BigNum finalArray;
      finalArray = new BigNum();
      if (left == true)
      {
         for(int i = SIZE-1; 0 < i; i--)
         {
            finalArray.bignum[i] = this.bignum[i-1];
         }
         finalArray.bignum[0] = 0;
      }
      else if (left == false)
      {
         for(int i=0; i < SIZE-1; i++)
         {
            finalArray.bignum[i] = this.bignum[i + 1];
         }
         finalArray.bignum[SIZE-1] = 0;
      }
      System.out.println(finalArray.toString());
   }
   
    /**
   * Returns int the value of two BigNum added
   * @ param BigNum
   * @ return int
   */
   public int add(BigNum num)
   {
      int sum=0;
      String value="";
      int counter=0;
      for (int i=0; i < SIZE; i++)
      {
         sum = this.bignum[i] + num.bignum[i] + sum + counter;
         if (sum > BASE )
         {
            value = (sum % BASE) + value;
            sum = 0;
            counter = 1;
         }
         else if (sum == BASE)
         {
            value = "0";
            sum = 0;
            counter = 1;
         }
         else 
         {
            value = sum + value;
            sum = 0;
            counter=0;
         }
      }
      return Integer.valueOf(value);
   }
   
   /**
   * Returns boolean that shows user if the BigNum is less than the other BigNum.
   * @ param BigNum
   * @ return boolean
   */
   public boolean isLessThan(BigNum other)
   {
      for(int i = SIZE - 1; i >= 0; i--)
      {
         if(this.bignum[i] < other.bignum[i])
            return true;
         else if(this.bignum[i] > other.bignum[i])
            return false;
      }
      return false;
   }
}