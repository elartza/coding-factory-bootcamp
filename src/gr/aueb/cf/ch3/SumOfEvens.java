package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of even until a number.
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please give a number");
        inputNumber = scanner.nextInt();

        while (i <= inputNumber) {
            sum += i;
            i+=2;
        }
        System.out.println("The sum of even numbers up to " + inputNumber + " is: " + sum);

        while (i <= inputNumber) {
            if (i % 2 ==0) {
                sum += i;
                i++;
            }
        }
        System.out.println("The sum of even numbers up to " + inputNumber + " is: " + sum);
    }
}
