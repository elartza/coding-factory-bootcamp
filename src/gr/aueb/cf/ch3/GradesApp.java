package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * the user will give his grades and the number of lessons and te program will calculate the average
 * and gives a string of
 * Excellent >=9
 * Very good 7.5>average>9
 * good 5>average>7.5
 * fail <5
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks:");
        totalMarks = scanner.nextInt();

        if (totalMarks <=0) {
            System.out.println("Total marks must not be negative or zero.");
            System.exit(1);
        }

        System.out.println("Please insert Courses count:");
        coursesCount = scanner.nextInt();

        if (coursesCount <=0) {
            System.out.println("Courses count must not be negative or zero.");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal than 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7.5) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }
    }
}
