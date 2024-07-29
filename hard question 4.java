public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static int findNthPrime(int n) {
        int count = 0, num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) return num;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int N = 3;
        int nthPrime = findNthPrime(N);

        System.out.println("The " + N + "th prime number is: " + nthPrime);

        int count = 0, num = nthPrime + 1;
        while (count < N) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
