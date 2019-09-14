/**
 * Author: Nkem Ohanenye
 * Purpose: The driver for the fibonacci class
 */
package Lab3;

public class FibonacciDriver extends Fibonacci{

    public FibonacciDriver(){

        System.out.println(factorial(5));
        System.out.println(factorialNR(5));
    }

    public static void main(String args[]){
        new FibonacciDriver();
    }

}