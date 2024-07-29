import java.util.Scanner;
public class CollegeUsersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();
        if (totalUsers < 0) {
            System.out.println("Please enter a positive number for total users.");
            return;
        }
        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();
        if (staffUsers < 0) {
            System.out.println("Please enter a positive number for staff users.");
            return;
        }
        if (staffUsers > totalUsers) {
            System.out.println("Staff users cannot be more than total users.");
            return;
        }
        int nonTeachingStaffUsers = staffUsers / 3;
        int totalStaffUsers = staffUsers + nonTeachingStaffUsers;
        if (totalStaffUsers > totalUsers) {
            System.out.println("Total staff (including non-teaching) exceeds total users. Please check your input.");
        } else {
            int studentUsers = totalUsers - totalStaffUsers;
            System.out.println("Student Users: " + studentUsers);
        }
    }
}