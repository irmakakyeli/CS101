/**
 * Making a library with array list
 */
import java.util.ArrayList;
public class Library 
{
  // properties
  ArrayList<LibraryBook>LibraryList;
  LibraryBook emptyBook;
  
  // constructors
  Library()
  {
    LibraryList = new  ArrayList<LibraryBook>();
    emptyBook = new LibraryBook(null, null, null);
  }
  
  // methods
  public boolean isEmpty()
  {
    if (LibraryList.size()==0)
      return true;
    else 
      return false;
  }
  
  public String toString()
  {
    return "" + LibraryList; 
  }
  
  public void add(String title, String author)
  {
    LibraryList.add(new LibraryBook(title, author, ""));
  }
  
  public void remove(String title)
  {
    String command="";
    while(!command.equals("Exit"))
    {
      for(int index=0; index < LibraryList.size(); index++)
      {
        if(title.equals(LibraryList.get(index).title))
        {
          command="Exit";
          LibraryList.remove(index);
        }
        else
          command="Exit";        
      }
    }
  }


public LibraryBook findByTitle(String title)
{
  for (int index=0; index < LibraryList.size(); index++)
  {
    if(title.equals(LibraryList.get(index).title))
      return LibraryList.get(index);
  }
  return emptyBook;
}
}

