/**
 * Editor: Nkem Ohanenye
 * Date: 3/5/2018
 * Purpose: To help the program sort in different ways:
 * 1. Order	alphabetically by name (first name, then last name)
 * 2. Order	by year	of birth—decreasing
 * 3. Order by length of “fact”—increasing
 * Added a third choice to order by fact length
 */
//---------------------------------------------------------------------------
// CSPeople.java            by Dale/Joyce/Weems                     Chapter 6
//
// Reads information about famous computer scientists from the file 
// input/FamousCS.txt. Allows user to indicate if they wish to see the list 
// sorted by name or by year of birth.
//---------------------------------------------------------------------------
package Lab6;

import java.io.*;
import java.util.*;

public class CSPeople
{
  public static void main(String[] args) throws IOException 
  {
    // Get user's display preference
    Scanner scan = new Scanner(System.in);
    int choice;
    System.out.println("  1: Sorted by name? \n  2: Sorted by year of birth? " +
            "\n  3: Sorted by length of fact?");
    System.out.print("\nHow would you like to see the information > ");
    choice = scan.nextInt();
    
    // Instantiate sorted list
    SortedABList<FamousPerson> people;
    if (choice == 1)
      people = new SortedABList<FamousPerson>(); // defaults to natural order
    else if (choice == 2)
      people = new SortedABList<FamousPerson>(FamousPerson.yearOfBirthComparator());
    else
      people = new SortedABList<FamousPerson>(FamousPerson.factComparator());
    
    // Set up file reading
    FileReader fin = new FileReader("src/input/FamousCS.txt");
    Scanner info = new Scanner(fin);
    info.useDelimiter("[,\\n]");  // delimiters are commas, line feeds
    FamousPerson person;
    String fname, lname, fact;
    int year;

    // Read the info from the file and add it to the list
    while (info.hasNext())      
    {
      fname = info.next();   lname = info.next();
      year = info.nextInt(); fact = info.next();
      person = new FamousPerson(fname, lname, year, fact);
      people.add(person);
    }
    
    // Display the list, using the advanced for loop
    System.out.println();
    for (FamousPerson fp: people)
       System.out.println(fp);
  } 
} 