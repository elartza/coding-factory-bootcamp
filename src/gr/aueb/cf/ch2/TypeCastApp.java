package gr.aueb.cf.ch2;

/**
 * Typecast demo
 */

public class TypeCastApp {
    public static void main(String[] args) {
        int num1 = 10; // int literals -> int -> 32-bit
        long num2 = 20;

        num1 = (int)num2;

        System.out.println(num1);
    }
}
