import java.util.Scanner;

/**
 * __Library Test___ 
 * @author __Irmak Akyeli___
 * @version __12/12/2018__
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      Library library;
      String command;
      String command2;
      String title;
      String title2="";
      String author;
      LibraryBook book;
      boolean onLoan;
      String dueDate;
      String bookTitle;
      
      // program code
      library = new Library();
      System.out.println("please chose: Show / Find / Add / Exit");
      command = scan.next();
      
      while (!command.equals("Exit"))
      {
         if (command.equals("Show"))
         {
            System.out.println(library.toString());
         }
         else if (command.equals("Find"))
         {
            System.out.println("please enter the title you want to search: ");
            title = scan.next();
            book = library.findByTitle(title);
            
            if (!title.equals(null))
            {
               System.out.println(book);
               System.out.println("What would you like to do? \nLoan / Return / Remove / Exit");
               command2 = scan.next();
               onLoan = book.onLoan();
               
               while(!command2.equals("Exit")) 
               {
                  if (command2.equals("Loan"))
                  {
                     if( onLoan != true)
                     {
                        System.out.println("enter the new due date: ");
                        dueDate = scan.next();
                        book.Loan(dueDate);
                     }
                     else
                     {
                        System.out.println("book is already loaned.");
                     }
                  }
                  else if (command2.equals("Return"))
                  {
                     if(onLoan = false)
                        System.out.println("the book is not loaned");
                     else
                        book.ReturnBook();
                  }
                  else if (command2.equals("Remove"))
                     library.remove(book);  
                  
                  System.out.println("What would you like to do? \nLoan / Return / Remove / Exit");
                  command2 = scan.next();
               }
            }
            else
               System.out.println("the book with this title does not exist in the library.");
         }
         else if (command.equals("Add"))
         {
            System.out.println("enter the title and the author of the book: ");
            title2 = scan.next();
            author = scan.next();
            library.add(title2, author);
         }
         System.out.println("please chose: Show / Find / Add / Exit");
         command = scan.next();
      }
      System.out.println("Goodbye");
   }
}