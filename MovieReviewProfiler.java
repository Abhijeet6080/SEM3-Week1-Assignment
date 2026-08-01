import java.util.Scanner;

public class MovieReviewProfiler {

    static void classifyWordLengths(String review) {

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        // Split review into words
        String[] words = review.split(" ");

        // Check length of each word
        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length >= 5 && length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short Words : " + shortWords);
        System.out.println("Medium Words: " + mediumWords);
        System.out.println("Long Words  : " + longWords);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Review: ");
        String review = sc.nextLine();

        classifyWordLengths(review);

        sc.close();
    }
}