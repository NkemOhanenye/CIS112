/**
 * User: Nkem Ohanenye
 * Date: 1/23/18
 * The test Driver for the Date class
 */
package Lab1;

public class DateTest {

    public static void main (String args[]){

        Date thisDate = new Date(5,4,2000);
        Date otherDate = new Date(5, 4, 2000);

        if (thisDate.compareTo(otherDate) == 0){
            System.out.println("We are the same");
        }

    }

}