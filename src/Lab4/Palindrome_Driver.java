/**
 * User: Nkem Ohanenye
 * Date: 2/20/18
 * Purpose: The driver for the DatePalindrome class
 */
package Lab4;

import java.util.Scanner;

public class Palindrome_Driver {

    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);

        String MM = null;
        final String STOP = "exit";

        while (!STOP.equals(MM)){

            System.out.println("Use " + STOP + " to stop, Enter a yearStack like ####: ");
            MM = scan.nextLine();

            if (!STOP.equals(MM)){

                if (DateParlindromes.yearStack(MM)){        //takes the number entered and loops through the year an checks for a palindrome
                    int y1 = Integer.parseInt(MM);
                    for(int j=y1; j <= y1;j++) {
                        char print = (char) j;
                        DateParlindromes.genDates(print);
                    }
                }
            }
        }
    }
}