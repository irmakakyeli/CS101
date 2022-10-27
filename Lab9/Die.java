/**
 * A simple Java class!
 */
public class Die 
{
   // properties
   int faceValue;
   
   // constructors
   public Die()
   {
      faceValue = (int)(Math.random() * 6 + 1);
   }

   // methods to find the face value
   public int roll()
   {
      faceValue = (int)(Math.random() * 6 + 1);
      return faceValue;
   }
   
   public int getFaceValue()
   {
      return faceValue;
   }
   
   //turns the face value into String
   public String toString()
   {
      return "" + faceValue;
   }
}
