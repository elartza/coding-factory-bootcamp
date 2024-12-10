package gr.aueb.cf.ch2;

import static java.lang.Math.ceil;

/**
 * A small frog wants to go to the other side of the road.
 * The frog is currently located at position X and want to go to a position
 * grater or equal than Y. The small frog jumps a fixed distance D. Find the minimum number of jumps.
 * X = 10
 * Y = 85
 * D = 30
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 40 = 100
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        double target = 85.0;
        double start = 10.0;
        double hop = 30.0;
        double jumps = 0.0;

        // Calculate Jumps
        jumps = ceil((target - start)/hop); // ceil == round up (ταβάνι/οροφή)

        System.out.println("Jumps: " + jumps);
    }
}
