/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2;

/**
 *
 * @author joao
 */
public class NumericalUtilities {

    /* 2 a. */
    public static int powerOf(int base, int expoente) {
        int result = 0;

        for (int i = 1; i < expoente; i++) {
            result += base * base;
        }

        return result;
    }

    /* 2 b. */
    public static int sumOfNaturalNumbersUpTo(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /* 2 c. */
    public static int sumOfNaturalNumbersBetween(int n1, int n2) {
        int result = 0;

        for (int i = n1; i < n2; i++) {
            result += i;
        }

        return result;
    }

    /* 2 d. */
    public static int sumOfEvenNumbersBetween(int n1, int n2) {
        int result = 0;

        for (int i = n1; i < n2; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }

        return result;
    }

    /* 2 e. */
    public static int numberOfDivisorsOf(int n) {
        int divisores = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }

        return divisores;
    }

    /* 2 f. incompleto */
    public static boolean isPrime(int n) {
        boolean prime = false;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                prime = true;
            }
        }
        
        return prime;
    }
}
