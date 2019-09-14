/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 4/13/18
 * Time: 11:53 AM
 */
package Final.Examples;

public class Move {
    // consists of a combination of 3 letters representing 3 coins (H or T)
    String from;
    String to;
    boolean legal; //is it a legal move or not

    public Move(String strFrom, String strTo /*,legalMove*/) {
        from = strFrom;
        to = strTo;
        //legal = legalMove;
    }

    /*public boolean isLegal(String fromCoins, String toCoins){

    }*/


}