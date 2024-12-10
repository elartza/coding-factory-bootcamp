package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSeconds {
    public static void main(String[] args) {

        // Convention
        final int SECONDS_PER_DAYS = 86400;
        final int SECONDS_PER_HOURS = 3600;
        final int SECONDS_PER_MINUTES = 60;

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert days");
        days = in.nextInt();
        System.out.println("Please insert hours");
        hours = in.nextInt();
        System.out.println("Please insert minutes");
        minutes = in.nextInt();
        System.out.println("Please insert seconds");
        seconds = in.nextInt();

        totalSeconds = days * SECONDS_PER_DAYS + hours * SECONDS_PER_HOURS + minutes * SECONDS_PER_MINUTES + seconds;

        System.out.printf(Locale.US,"Seconds in %d days, %d hours, %d minutes, %d seconds is: %,d seconds", days, hours, minutes, seconds, totalSeconds);
    }
}