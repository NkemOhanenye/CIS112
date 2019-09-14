/**
 * User: Nkem Ohanenye
 * Date: 2/20/18
 * Purpose: create a class based off the Palindrome class
 * that shows the palindromes of a given year and outputs the dates
 */
package Lab4;

public class DateParlindromes {

    //used to check the amount of days in each month
    static int[] month = {0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};

    //Generates the dates of the years entered
    public static void genDates(char year) {

        int y = (int) year;             //uses the character as an int for the rest of the code

        String MM = Integer.toString((y%1000)/100)
                + Integer.toString(y/1000);                 //used to mod through the months and match with the years to create the palindrome
        String DD = Integer.toString(y%10)
                + Integer.toString((y/10)%10);              //used to mod through the dates and match with the years to create the palindrome

        int m = Integer.parseInt(MM);
        int d = Integer.parseInt(DD);
        String yyyy = Integer.toString(y);              //makes the y a string to be printed

        if (m > 0 && m < 13) {              //makes sure the months arent 0 or greater than 12
            if (d > 0 && d <= (m != 2 ? month[m] : (year % 4 != 0) ? 28:29))        //calculates the amount of of days in a year based on the months of each year
                System.out.println(DD+MM+yyyy);                 //prints the palindrome
        }
    }


    public static boolean yearStack(String YYYY){               //takes in the year entered

        char ch;            //the string being taken as YYYY
        int ylength;        //the length of the YYYY string

        StackInterface<Character> stack;        //holds non blank int characters
        QueueInterface<Character> queue;        //also holds non blank int characters

        //initializes the length and the structures
        ylength = YYYY.length();
        stack = new ArrayBoundedStack<Character>(ylength);
        queue = new ArrayBoundedQueue<Character>(ylength);

        //handels the characters and sets up the limit of the year
        for (int i = 0; i < ylength; i++) {
            ch = YYYY.charAt(i);
            if (Character.isDigit(ch) && Character.toString(ch).length() <= 4
                    && Character.getNumericValue(ch) <= 9999) {
                stack.push(ch);
                queue.enqueue(ch);
            } else {
                stack.top();
                queue.dequeue();
            }
        }
        return true;
    }
}