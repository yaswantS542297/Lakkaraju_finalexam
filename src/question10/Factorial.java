/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author YaswantLakkaraju
 */
public class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println("Question 10 : Yaswant Lakkaraju");
        int number = 6, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}