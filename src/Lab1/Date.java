/**
 * User: Nkem Ohanenye
 * Date: 1/23/18
 * This project was editied by me to add in a Comparable to method
 */
//----------------------------------------------------------------------
// Date.java by Dale/Joyce/Weems Chapter 1
//
// Defines date objects with year, month, and day attributes.
//----------------------------------------------------------------------

package Lab1;

public class Date implements Comparable <Date> {        //allows the dates to be compared without creating an object

    protected int year, month, day;
    public static final int MINYEAR = 1583;

    // Constructor
    public Date(int newMonth, int newDay, int newYear)
    {
        month = newMonth;  day = newDay;  year = newYear;
    }

    // Observers
    public int getYear() { return year;  }
    public int getMonth(){ return month; }
    public int getDay()  { return day;   }

    public int lilian()
    {
        // Returns the Lilian Day Number of this date.
        // Precondition: This Date is a valid date after 10/14/1582.
        //
        // Computes the number of days between 1/1/0 and this date as if no calendar
        // reforms took place, then subtracts 578,100 so that October 15, 1582 is day 1.

        final int subDays = 578100;  // number of calculated days from 1/1/0 to 10/14/1582

        int numDays = 0;

        // Add days in years.
        numDays = year * 365;

        // Add days in the months.
        if (month <= 2)
            numDays = numDays + (month - 1) * 31;
        else
            numDays = numDays + ((month - 1) * 31) - ((4 * (month-1) + 27) / 10);

        // Add days in the days.
        numDays = numDays + day;

        // Take care of leap years.
        numDays = numDays + (year / 4) - (year / 100) + (year / 400);

        // Handle special case of leap year but not yet leap day.
        if (month < 3)
        {
            if ((year % 4) == 0)   numDays = numDays - 1;
            if ((year % 100) == 0) numDays = numDays + 1;
            if ((year % 400) == 0) numDays = numDays - 1;
        }

        // Subtract extra days up to 10/14/1582.
        numDays = numDays - subDays;
        return numDays;
    }

    @Override
    public String toString()
    // Returns this date as a String.
    {
        return(month + "/" + day + "/" + year);
    }

    //The Comparable Method
    public int compareTo(Date anotherDate){

        //Compares if the dates are the same
        if (getMonth() == anotherDate.getMonth() &&
                getDay() == anotherDate.getDay() &&
                getYear() == anotherDate.getYear()){
            return 0;
        }
        //Compares if 1st Date is less than 2nd Date
        if (getMonth() < anotherDate.getMonth() ||
                getDay() < anotherDate.getDay() ||
                getYear() < anotherDate.getYear()){
            return -1;
        }
        //Compares if 1st Date is greater than 2nd Date
        if (getMonth() > anotherDate.getMonth() ||
                getDay() > anotherDate.getDay() ||
                getYear() > anotherDate.getYear()){
            return 1;
        }
        return 0;
    }
}