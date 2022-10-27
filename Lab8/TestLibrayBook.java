import java.util.Scanner;

/**
 * __Test Libray Book___ 
 * @author __Irmak Akyeli___
 * @version __12/12/2018__
 */ 
public class TestLibrayBook
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      String string1;
      String string2;
      String string3;
      LibraryBook book1;
      LibraryBook book2;
      LibraryBook book3;
      LibraryBook book4;
      String newDueDate;
      
      // program code
      
      //to enable user to chose the book
      System.out.print("please enter the title: ");
      string1 = scan.next();
      System.out.print("please enter the auther: ");
      string2 = scan.next();      
      System.out.print("please enter the due date: ");
      string3 = scan.next();
      
      //using giving book as parametre
      book1 = new LibraryBook(string1 , string2, string3);
      System.out.println(book1);
      book2 = new LibraryBook("a", "b", "18/12/2018");
      
      //loaning the book
      System.out.print("please enter the new due date: ");
      newDueDate = scan.next();
      book1.Loan(newDueDate);
      System.out.println("times loaned: " + book1.getTimesLoaned());
      System.out.println( book1.onLoan());
      
      //returning the book
      book1.ReturnBook();
      System.out.println("book is returned");
      System.out.println( book1.onLoan());
      
       book3 = new LibraryBook(book1);
       book4 = book1;
      
      //comparing books
      //first way
      if( book1 == book1)
      {
         System.out.println("both book are the same");
      }
      else
      {
         System.out.println("both book are not the same");
      }
      
      if( book1 == book2)
      {
         System.out.println("both book are the same");
      }
      else
      {
         System.out.println("both book are not the same");
      }
      
      if( book1 == book4)
      {
         System.out.println("both book are the same");
      }
      else
      {
         System.out.println("both book are not the same");
      }
      
      //second way
      if(book1.equals(book1))
      {
         System.out.println("both book are the same");
      }
      else
      {
         System.out.println("both book are not the same");
      }
      
      if(book1.equals(book2))
      {
         System.out.println("both book are the same");
      }
      else
      {
         System.out.println("both book are not the same");
      }
      
      if(book1.equals(book4))
      {
         System.out.println("both book are the same");
      }
      else
      {
         System.out.println("both book are not the same");
      }
      
      System.out.println(book1.equals(book2));
      System.out.println(book1.hasSameTitle(book2));
      System.out.println(book1.hasSameAuthor(book2));
      
   }
}