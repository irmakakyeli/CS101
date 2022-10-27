/**
 * Making a library
 */
public class Library 
{
   // properties
   LibraryBook b1;
   LibraryBook b2;
   LibraryBook b3;
   LibraryBook b4;
   LibraryBook emptyBook;

   // constructors
   Library()
   {
   b1 = null;
   b2 = null;
   b3 = null;
   b4 = null;
   }
   
   // methods
   //returns true is library is empty
   public boolean isEmpty()
   {
      if (b1 == null && b2 == null && b3 == null && b4 == null)
         return true;
      else 
         return false;
   }
   
   //returns string version of the library
   public String toString()
   {
      return b1 + "\n" + b2 + "\n" + b3 + "\n" + b4; 
   }
   
   //adds a book to library
   public void add(String title, String author)
   {
      if (b1 == null)
         b1 = new LibraryBook(title, author, null);
      else if ( b2 == null)
         b2 = new LibraryBook(title, author, null);
      else if ( b3 == null)
         b3 = new LibraryBook(title, author, null);
      else if ( b4 == null)
         b4 = new LibraryBook(title, author, null);
      else
         System.out.println("library is full");
   }
   
   //removes the book chosen
   public boolean remove(LibraryBook book)
   {
      if (book == b1)
      {
       b1 = null;
       return true;
      }
      else if (book == b2)
      {
       b2 = null;
       return true;
      }
      else if (book == b3)
      {
       b3 = null;
       return true;
      }
      else if (book == b4)
      {
       b4 = null;
       return true;
      }
      else
      {
         return false;
      }
   }
   
   //finds the book searched by title
   public LibraryBook findByTitle(String title)
   {
      if( b1 != null && b1.title.equals(title))
         return b1;
      else if( b2 != null && b2.title.equals(title))
         return b2;
      else if( b3 != null && b3.title.equals(title))
         return b3;
      else if( b4 != null && b4.title.equals(title))
         return b4;
      else
         return null;
   }
}

