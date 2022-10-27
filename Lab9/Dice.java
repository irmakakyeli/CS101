/**
 * A simple Dice class!
 */
public class Dice 
{
   // properties
   Die die1;
   Die die2;
   
   // constructors
   public Dice()
   {
      die1 = new Die();
      die2 = new Die();
   }
   
   //getter methods
  public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }
   
   public int getDiceTotal()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }
   
   //calculates the sum of the faces of two dice
   public int roll()
   {
      int die1FaceValue;
      int die2FaceValue;
      die1FaceValue = die1.roll();
      die2FaceValue = die2.roll();
      return die1FaceValue + die2FaceValue;
   }
}
