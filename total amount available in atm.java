import java.util.Scanner;

public class ATMBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = {2000, 500, 200, 100};
        int[] notesCount = new int[denominations.length];
        System.out.println("Enter the number of notes for each denomination:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.print(denominations[i] + " rupee notes: ");
            notesCount[i] = scanner.nextInt();
        }
        int totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalAmount += denominations[i] * notesCount[i];
        }
        System.out.println("Total amount available in the ATM machine: " + totalAmount + " rupees");
    }
}