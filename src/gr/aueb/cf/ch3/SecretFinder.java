package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * there is a secret number and the user must find it by giving a number once.
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET_NUMBER = 12;

        System.out.println("Insert a number to guess the secret number:");
        num = scanner.nextInt();

        if (num == SECRET_NUMBER) {
            System.out.println("Secret number found!");
        }
        else {
            System.out.println("Fail to guess the number!");
        }
    }
}
