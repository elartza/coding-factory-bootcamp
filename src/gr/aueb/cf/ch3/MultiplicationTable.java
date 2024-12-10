package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int sum = 0;

        System.out.println("Enter an integer:");
        num = scanner.nextInt();

        while (i <= 10) {
            sum = num * i;
            System.out.printf("%d * %2d = %d", num, i, sum);
            System.out.println();
            i++;
        }
    }
}
