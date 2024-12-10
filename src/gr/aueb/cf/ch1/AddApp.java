package gr.aueb.cf.ch1;

/**
 * calculates the sum of two integers and the result is printed at console (standard output)
 */
public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int Num1 = 5;
        int Num2 = 12;
        int result = 0;

        System.out.println(result);

        //Εντλές
        result = Num1 + Num2;

        //Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + Num1 + " + " + Num2 + " είναι: " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με: %d", Num1, Num2, result);
    }
}
