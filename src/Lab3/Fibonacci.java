/**
 * Author: Nkem Ohanenye
 * Purpose: To create a class to produce the outcome of the
 * Fibonacci sequence recusively and nonrecusively.
 */
package Lab3;

public class Fibonacci {

    int factorial(int n){       //The recusive factorial method

        if (n == 1)             //if n is ever 1 it returns 1
            return 1;
        else
            return n * factorial(n - 1);        //the number times the factorial of the number before it

    }

    int factorialNR(int n){     //The nonrecusive factorial method

        int f = 1;          //to avoid getting a number other than 1 when n=1

        for (int i = 1; i <= n; i++){
            f *= i;         //multiplies 1 by the looped i and checked if <=
        }

        return f;       //returns the number

    }
}