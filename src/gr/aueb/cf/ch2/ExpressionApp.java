package gr.aueb.cf.ch2;

/**
 * Expressions demo.
 */

public class ExpressionApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;


        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        System.out.println("------");

        result1 = num1++;
        System.out.println(result1);

        System.out.println("------");

        result2 = ++num2;
        System.out.println(result2);
    }
}