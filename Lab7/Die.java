/**
 * A simple Java class!
 */
public class Die 
{
   // properties
   Die die;
   // constructors
   public int roll()
   {
      return (int)(Math.random() * 6 + 1);
   }
   // methods
   public int getFacedValue()
   {
      return Die.roll;
   }

}
