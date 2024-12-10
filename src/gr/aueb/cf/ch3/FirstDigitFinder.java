package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the first left digit of an integer number.
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("Please enter a positive number:");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while (tempNum >= 10) {
            tempNum /= 10; // tempNum = tempNum / 10;
        }
        System.out.printf("The first digit of %d is: %d", inputNum, tempNum);
    }
}
