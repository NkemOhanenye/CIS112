/**
  * User: Nkem Ohanenye
  * Date: 2/6/18
  * Purpose: To make a program that allows the user to edit the string the
  * give to be edited using the ArrayBoundedStack class
  */
package Lab2;

import java.util.Scanner;           //imports the scanner

public class EditString {

    public static void main(String[] args) {

        //the main variables used around the class
        String edit;
        String mainText;
        Scanner scan = new Scanner(System.in);

        //imports the Stack class to be used
        StackInterface<String> stringStack;
        stringStack = new ArrayBoundedStack<String>();

        //tells the user what to input
        System.out.println("U - make all letters uppercase\n" +
                "L - make all letters lowercase\n" +
                "R - reverse the string\n" +
                "C ch1 ch2 - change all occurrences of ch1 to ch2\n" +
                "Z - undo the most recent change\n");

        //the starter code
        System.out.println("Enter the text you wish to change > ");
        mainText = scan.nextLine();
        stringStack.push(mainText);                     //pushes changed text
        System.out.println(mainText);
        System.out.print("\n" + "Enter your command > ");

        while (!scan.hasNext("X")) {                //if "X" is inputed, the program will stop

            mainText = stringStack.top();               //makes the mainText always the top

            if (scan.hasNext("U")) {                    //sets the text to uppercase
                edit = mainText.toUpperCase();
                stringStack.push(edit);
                System.out.println(edit + "\n");
                System.out.print("Enter your command > ");
                scan.next();
            }
            if (scan.hasNext("L")) {                    //sets the text to lowercase
                edit = mainText.toLowerCase();
                stringStack.push(edit);
                System.out.println(edit + "\n");
                System.out.print("Enter your command > ");
                scan.next();
            }
            if (scan.hasNext("R")) {                    //reverses the text
                edit = new StringBuilder(mainText).reverse().toString();
                stringStack.push(edit);
                System.out.println(edit + "\n");
                System.out.print("Enter your command > ");
                scan.next();
            }
            if (scan.hasNext("C")) {                    //changes desired letter for different letter
                System.out.println("\nEnter your first character >");
                scan.nextLine();
                String ch1 = scan.next();
                System.out.println("\nEnter your second character >");
                String ch2 = scan.next();
                edit =  mainText.replaceAll(ch1, ch2);
                stringStack.push(edit);
                System.out.println(edit + "\n");
                System.out.print("Enter your command > ");
            }
            if (scan.hasNext("Z")) {                    //gets rid of the last push to undo the change
                stringStack.pop();
                edit = stringStack.top();
                System.out.println(edit + "\n");
                System.out.print("Enter your command > ");
                scan.next();
            }
        }
    }
}