package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamWithMethod {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/file7-ps.text")) {
            printMessage(ps, "Hello Coding Factory!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
