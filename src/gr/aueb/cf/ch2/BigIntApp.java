package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BIgInteger class demo.
 */
public class BigIntApp {
    public static void main(String[] args) {
        // Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("343943544544343434335532323223322332323232323232323232323232323232323223323232416644664645357766666");
        BigInteger bigNum2 = new BigInteger("123456674543443434343434543866666");
        BigInteger result;

        // Commands
        result = bigNum1.multiply(bigNum2);

        //Printing the results
        System.out.printf("%,d", result);
    }
}