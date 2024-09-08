package job_ready_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author michaelstucki
 */
public class GuessingGame2 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 20;
        Scanner scanner = new Scanner(System.in);
        String userPrompt = "Enter a number between " + MIN + " and " + MAX + " : ";

        // Hardcode the target number to be guessed by the user
        Random random = new Random();
        final int answer = random.nextInt(MAX) + MIN;

        String guessStr;
        int guess = Integer.MIN_VALUE;
        boolean isGuessed = false;
        int tries = 0;

        // Game loop
        do {
            tries++;
            // Get a number from user
            boolean isValid = false;
            do {
                System.out.print(userPrompt);
                guessStr = scanner.nextLine();

                // Make sure it's an integer
                try {
                    guess = Integer.parseInt(guessStr);
                    isValid = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Not a number!");
                }
            } while (!isValid);

            // Evaluate user's guess
            if (guess >= MIN && guess <= MAX) {
                if (guess == answer) {
                    isGuessed = true;
                } else if (guess > answer) {
                    System.out.println("Guess is too high. Pick a lower number!");
                } else {
                    System.out.println("Guess is too low. Pick a higher number!");
                }
            }
        } while (!isGuessed);

        System.out.println("\nYou guess it! The answer was: " + answer);
        System.out.println("It took you " + tries + " tries.");
    }
}
