/**
 * a class which lets you borrow and return a book
 */
public class LibraryBook 
{
   // properties
   String title;
   String author;
   String dueDate;
   int timesLoaned;
   boolean bookisaway;
   
   // constructors
   public LibraryBook(String String1 , String String2, String String3)
   {
      title = String1;
      author = String2;
      dueDate = String3;  
      timesLoaned = 0;
   }
   
   // methods
   public String toString()
   {
      return "title: " + title+ "\nWriter: " + author + "\ndueDate: " + dueDate + "\ntimes loaned: " + timesLoaned;
   }
   
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   
   public void Loan(String newDueDate)
   {
      this.dueDate = newDueDate;
      bookisaway = true;
      timesLoaned++;
   }
   
   public void ReturnBook()
   {
      bookisaway = false;
      this.dueDate = "";
   }
   
   public boolean onLoan()
   {
      return bookisaway;
   }
}