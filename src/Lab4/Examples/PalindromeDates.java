/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 2/20/18
 * Time: 10:42 AM
 */
package Lab4.Examples;

public class PalindromeDates {
    static int[] mon = {0, 31,28,31,30,31,30,31,31,30,31,30,31};

    public static void genPalin(int y) {
        String mm = Integer.toString((y%1000)/100) + Integer.toString(y/1000);
        String dd = Integer.toString(y%10) + Integer.toString((y/10)%10);

        int m = Integer.parseInt(mm);
        int d = Integer.parseInt(dd);
        String yyyy = Integer.toString(y);
        if (m>0 && m<13) {
            if (d>0 && d <= (m != 2 ? mon[m] : (y%4!=0) ? 28:29))
            System.out.println(dd+mm+yyyy);
        }
    }
    public static void main(String args[]) {
        int y1 = 2001;
        int y2 = 2040;
        for(int i=y1;i<=y2;i++)
            genPalin(i);
    }
}