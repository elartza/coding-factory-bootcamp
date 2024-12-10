package gr.aueb.cf.ch2;

import java.util.Random;

/**
 * Random app.
 */

public class RandomApp {
    public static void main(String[] args) {

        Random rand = new Random();

        int rand_int1 = rand.nextInt(7);
        int rand_int2 = rand.nextInt(7);

        System.out.println(rand_int1);
        System.out.println(rand_int2);
    }
}
