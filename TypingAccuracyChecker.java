import java.util.Scanner;

public class TypingAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {

        int matched = 0;
        int firstMismatch = -1;

        // Compare both strings character by character
        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        // Calculate accuracy
        double accuracy = (matched * 100.0) / original.length();

        System.out.printf("Matched: %d/%d\n", matched, original.length());
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at Position "
                    + (firstMismatch + 1)
                    + " ('" + original.charAt(firstMismatch)
                    + "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Original Text: ");
        String original = sc.nextLine();

        System.out.print("Enter Typed Text: ");
        String typed = sc.nextLine();

        checkTypingAccuracy(original, typed);

        sc.close();
    }
}