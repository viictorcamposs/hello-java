import java.util.Scanner;
import java.util.Locale;

public class scanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("You typed: %.2f%n", x);

        sc.close();
    }
}
