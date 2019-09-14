/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 4/17/18
 * Time: 10:03 AM
 */
package Final.Examples;

public class Game {
    //instance variables
    //ONE game has a list of Moves
    // count of Moves for this game

    public void play() {
        String from = "HTH"; //initial state is HTH
        String to = from;
        //continue to make moves until computer gets to final state of THT,
        //storing each move along the way and recording whether it was legal or not
        boolean bDone = false;
        while  (!bDone)
        {
            // select “TO” state by randomly selecting which coin to flip
            int randNum = (int)(Math.random()); //will give me 0,1, or 2
            //use random number to determine which character(coin) in 3-char string is to be flipped
            // to “flip” a coin,   if H, then make it T; else if T, make it H
            // check if move has been made in previous games and
            // if not , then double-check rules (only 2) for game to determine if valid move
        }
    } //end play
}