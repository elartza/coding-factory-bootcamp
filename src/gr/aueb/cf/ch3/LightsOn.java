package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining AND car is running (>100) OR is dark
 */

public class LightsOn {
    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isDark = false;
        boolean lightOn = false;
        boolean isRaining = false;
        boolean isCarRunning = false;
        boolean areLightsOn = false;
        int carSpeed;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert if it is raining:");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark:");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert car's speed:");
        carSpeed = scanner.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && isCarRunning || isDark;

        System.out.println("Turn lights on: " + areLightsOn);
    }
}
