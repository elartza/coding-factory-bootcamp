package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates n!
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert unput num:");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            facto *= i; // facto = facto *i
            i++;
        }
        System.out.println("Factorial: " + facto);
    }
}
