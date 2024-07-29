import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0;

        System.out.println("Enter characters (enter * to stop):");

        while (true) {
            char ch = scanner.next().charAt(0);

            if (ch == '*') {
                break;
            }
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of digits: " + digitCount);
    }
}