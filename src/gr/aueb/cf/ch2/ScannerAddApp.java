package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two integers from standard input (keyboard)
 * and calculated the result (sum)
 */
public class ScannerAddApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        // Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι: %d", num1, num2, sum);
    }
}
