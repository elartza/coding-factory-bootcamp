package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowing if raining AND temperature < 0
 */
public class SnowingUp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner scanner = new Scanner(System.in);

        int temp = 0;

        System.out.println("Please insert if it is raining:");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert the temperature:");
        temp = scanner.nextInt();

        //isSnowing
        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }
}
