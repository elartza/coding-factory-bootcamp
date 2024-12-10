package gr.aueb.cf.ch5;

public class EvenOddApp {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd: " + isOdd(num));
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

