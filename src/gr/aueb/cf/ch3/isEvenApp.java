package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Check if an integer is even.
 */
public class isEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please insert a number:");
        num = scanner.nextInt();

        // isEven
        isEven = num % 2 == 0;

        System.out.printf("%d is even: %b", num, isEven);
    }
}