package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common
 * use case, that is conditional assignment.
 * bas(num) always positive.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please enter a num:");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;
        System.out.println("abs: " + abs);
    }
}