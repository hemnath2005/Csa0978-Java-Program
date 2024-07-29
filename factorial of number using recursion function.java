import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}