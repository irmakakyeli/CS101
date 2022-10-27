import java.util.Scanner;

/**
 * __Test Libray Book___ 
 * @author __your name___
 * @version __date__
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
      LibraryBook book;
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
      book = new LibraryBook(string1 , string2, string3);
      System.out.println(book);
      //loaning the book
      System.out.print("please enter the new due date: ");
      newDueDate = scan.next();
      book.Loan(newDueDate);
      System.out.println("times loaned: " + book.getTimesLoaned());
      System.out.println( book.onLoan());
      //returning the book
      book.ReturnBook();
      System.out.println("book is returned");
      System.out.println( book.onLoan());
   }

}