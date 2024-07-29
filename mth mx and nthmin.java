import java.util.*;

public class MthMaxNthMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of M for Mth maximum:");
        int M = scanner.nextInt();

        System.out.println("Enter the value of N for Nth minimum:");
        int N = scanner.nextInt();

        if (M <= 0 || M > size || N <= 0 || N > size) {
            System.out.println("M or N is out of the valid range.");
            return;
        }

        Arrays.sort(array);
        int mthMax = array[size - M];
        int nthMin = array[N - 1];

        System.out.println("Mth Maximum number: " + mthMax);
        System.out.println("Nth Minimum number: " + nthMin);
        System.out.println("Sum: " + (mthMax + nthMin));
        System.out.println("Difference: " + (mthMax - nthMin));
    }
}