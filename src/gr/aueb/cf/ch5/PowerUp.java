package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates a^n.
 */
public class PowerUp {
    public static void main(String[] args) {
        for (int b = 1, p = 1; b <= 10; b++, p++) {
            System.out.printf("%,d\n", pow(b, p));
        }
    }

    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result = result * a;
//        }
//        return result;
        return (long) Math.pow(a, n);
    }
}
