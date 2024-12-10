package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Shows a menu for user to select an item.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice is not valid.");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Epilekste ena apo ta parakatw:");
        System.out.println("1. Eisagogi");
        System.out.println("2. Diagrafi");
        System.out.println("3. Anazitisi");
        System.out.println("4. Enimerosi");
        System.out.println("5. Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Eisagogi process");
                break;
            case 2:
                System.out.println("diagrafi process");
                break;
            case 3:
                System.out.println("Anazitisi process");
                break;
            case 4:
                System.out.println("Enimerosi process");
                break;
            case 5:
                System.out.println("Exit process");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
