package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT.
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double VAT_RATE = 0.24;

        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double Vat = 0.0;

        System.out.println("Please insert the price:");
        inputPrice = scanner.nextDouble();


        Vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + Vat;
        System.out.printf("Price: %.2f, Vat: %.2f, Price with VAT: %.2f", inputPrice, Vat, priceWithVat);
    }
}
