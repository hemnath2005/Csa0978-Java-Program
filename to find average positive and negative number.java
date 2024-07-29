import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0, positiveCount = 0;
        int negativeSum = 0, negativeCount = 0;

        System.out.println("Enter numbers (enter -1 to stop):");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }

        double positiveAverage = (positiveCount > 0) ? (double) positiveSum / positiveCount : 0;
        double negativeAverage = (negativeCount > 0) ? (double) negativeSum / negativeCount : 0;

        System.out.println("Average of positive numbers: " + positiveAverage);
        System.out.println("Average of negative numbers: " + negativeAverage);
    }
}