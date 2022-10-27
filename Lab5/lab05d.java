import java.util.Scanner;

/**
 * __pi___ 
 * @author __Irmak Akyeli___
 * @version __07/11/2018__
 */ 
public class lab05d
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    double firstvariable=1;
    double secondvariable=1;
    //secondcondition is for kaing the formula with one + and one - value
    int secondCondition=2;
    double term;
    double term2;
    int number;
    double pi=0;
    double pi2=0;
    double accuracy;
    // program code
    
    //printing the pi accepted as constant
    System.out.println(Math.PI);
    
    //computing pý with number of term selected
    System.out.print("please enter the number of terms you want to compute: ");
    number = scan.nextInt();
    for ( int firstCondition=0; firstCondition < number; firstCondition++)
    {
      if (firstCondition % 2 == 0)
        term = 4 / firstvariable;
      else
        term = -4 / firstvariable;
      pi=pi+term;
      firstvariable=firstvariable+2; 
    }
         System.out.println(pi); 
         
    //computing pi with accuracy entered     
    System.out.print("please enter the accuracy you want to compute: ");
    accuracy = scan.nextDouble();
    while (Math.abs(Math.PI - pi2) > accuracy)
    {
      if (secondCondition % 2 == 0)
        term2 = 4 / secondvariable;
      else
        term2 = -4 / secondvariable;
      pi2 = pi2 + term2;
      secondvariable = secondvariable + 2; 
      secondCondition = secondCondition + 1;
    }
     System.out.println(pi2);      
    }
  }
         
