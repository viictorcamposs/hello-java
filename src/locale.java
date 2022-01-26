import java.util.Locale;

public class locale {
    public static void main(String[] args) {
        double x = 10.357869;

        System.out.println(x);
        System.out.printf("%.3f%n", x);

        // Concatenating several strings
        String name = "Victor";
        String lastName = "Campos";

        System.out.println("Hello, my name is " + name + " " + lastName + "." + " Nice to meet y'all.");

        // Concatenating several elements in the same string
        System.out.printf("Result equals to %.2f centimeters.%n", x);

        // %f = floating
        // %d = integer
        // %s = string
        // %c = char
        // %n = break line

        // Solving problem
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 23;
        int code = 5290;
        char gender = 'M';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c %n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);
    }
}
