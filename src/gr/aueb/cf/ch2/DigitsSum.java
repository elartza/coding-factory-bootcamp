package gr.aueb.cf.ch2;


import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNumber;
        int sum = 0;

        System.out.println("Please insert a two-digit integer");
        inputNumber = in.nextInt();

        leftDigit = inputNumber / 10;
        rightDigit = inputNumber % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Input number: %d, leftdigit: %d, rightdigit: %d, Sum: %d", inputNumber, leftDigit, rightDigit, sum);
    }
}
