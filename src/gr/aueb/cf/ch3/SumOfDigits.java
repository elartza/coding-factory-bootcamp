package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer:");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        // to do
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit; // sum =sum +rightDigit;
            tempNum /= 10; // tempNum = tempNum / 10;
        }
        System.out.println("The sum of digits od " + inputNum + " is " + sum);
    }
}
