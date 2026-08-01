import java.util.Scanner;

public class DuplicateSeatChecker {

    // Method to check duplicate seat numbers
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        // Compare each seat number with every other seat number
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {

                // If two seat numbers are the same
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break; // Prevent printing the same duplicate multiple times
                }
            }
        }

        // If no duplicate was found
        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user how many seat numbers they want to enter
        System.out.print("Enter the number of seat numbers: ");
        int n = sc.nextInt();

        // Create an array to store seat numbers
        int[] seatNumbers = new int[n];

        // Take seat numbers as input
        System.out.println("Enter the seat numbers:");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = sc.nextInt();
        }

        // Call the method to check for duplicates
        checkDuplicateSeats(seatNumbers);

        sc.close();
    }
}