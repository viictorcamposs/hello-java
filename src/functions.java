public class functions {
    public static int doubly(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int x = 5;

        x = x + doubly(5);
        System.out.println(x);
    }
}
