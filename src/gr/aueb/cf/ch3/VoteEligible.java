package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Eligible age for voting is > 18
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int VOTING_AGE = 18;
        int age = 0;
        boolean voteIsEligible;

        System.out.println("Please insert your age:");
        age = scanner.nextInt();

        voteIsEligible = age >= VOTING_AGE;

        System.out.printf("Age is %d, You can Vote: %b", age, voteIsEligible);

    }
}
