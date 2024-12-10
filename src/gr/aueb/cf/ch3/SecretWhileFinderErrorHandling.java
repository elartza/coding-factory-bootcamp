package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinderErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET_NUMBER = 12;
        boolean success = false;

        while (true) {
            System.out.println("Insert a number to guess the secret number:");
            num = scanner.nextInt();

            if (num != SECRET_NUMBER) {
                System.out.println("try again!");
                continue;
            }
            System.out.println("Bingo!");
            break;
        }
    }
}
