//----------------------------------------------------------------------
// ReverseStrings.java         by Dale/Joyce/Weems             Chapter 2
//
// Sample use of stack. Outputs strings in reverse order of entry.
//----------------------------------------------------------------------
package Lab2.Examples;

import Lab2.ArrayBoundedStack;
import Lab2.StackInterface;

import java.util.Scanner;

public class ReverseStrings 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    StackInterface<String> stringStack;
    stringStack = new ArrayBoundedStack<String>(3);
    
    String line;
    
    for (int i = 1; i <= 3; i++)
    {
      System.out.print("Enter a line of text > ");
      line = scan.nextLine();
      stringStack.push(line);
    }
       
    System.out.println("\nReverse is:\n");
    while (!stringStack.isEmpty())
    {
      line = stringStack.top();
      stringStack.pop();
      System.out.println(line);
    }
  }
}