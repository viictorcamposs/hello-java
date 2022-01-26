package MathFunctions;

import java.util.Locale;
//import java.lang.Math; // No need to import because Math is an internal class of java

public class MathFunctions {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);

        System.out.printf("Raiz quadrada de %.1f = %.2f%n", x, A);
        System.out.printf("Raiz quadrada de %.1f = %.2f%n", y, B);
        System.out.printf("Raiz quadrada de 25 = %.2f%n", C);

        // Math.sqrt = raiz quadrada
        // Math.pow = potenciação
        // Math.abs = valor absoluto
    }
}
