

public class Main {
    public static void main(String[] args) {
        // 4! = 4 * 3!
        // n! = n * (n -1)!
        System.out.println(factorial(4));
    }
    public static int factorial(int n) {
        // Base condition
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}