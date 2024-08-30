package job_ready_java;

import java.util.Scanner;

/**
 *
 * @author michaelstucki
 */
public class GuessingGame {

    // Define valid number ranges
    static final int MIN = 1;
    static final int MAX = 20;

    // Prompt for user input
    static final String numberPrompt = "Enter a number between " + MAX + " and " + MIN + " inclusive: ";

    // Get number from user in specified range
    static int getNumber(Scanner scanner) {
        int number = 0;
        String numberStr;
        boolean valid = false;
        do {
            System.out.print(numberPrompt);
            numberStr = scanner.nextLine();
            try {
                number = Integer.parseInt(numberStr);
                if (number >= MIN && number <= MAX) {
                    valid = true;
                } else {
                    System.out.println("Number is out of range!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Number was not entered!");
            }
        } while (!valid);
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get target number
        System.out.println("Enter the target number.");
        int target = getNumber(scanner);

        // Start game loop
        int guess;
        int tries = 0;
        System.out.println("Try guessing the target number.");
        boolean guessed = false;
        do {
            tries++;
            guess = getNumber(scanner);
            if (guess == target) {
                System.out.println("You guessed it!");
                guessed = true;
            } else if (guess < target) {
                System.out.println("Guess is too low!");
            } else {
                System.out.println("Guess is too high!");
            }
        } while (!guessed);

        // Report number of guesses
        System.out.println("Number of guesses: " + tries);
        scanner.close();
    }
}
