import java.util.Scanner;

public class Guessno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) {
            int attempts = 1;
            int score = 0;
            int totalScore = 0;
            int numberOfRounds = 3;

            System.out.println("=== Guess the Number ===");

            for (int round = 1; round <= numberOfRounds; round++) {
                int number = 1 + (int) (100 * Math.random()); // Generate a random number between 1 and 100
                System.out.println("\nRound " + round);
                System.out.println("A random number between 1 and 100 has been generated. You have 10 attempts.");

                while (attempts <= 10) {
                    System.out.println("\nAttempt " + attempts);
                    System.out.println("Guess the number: ");
                    int guess = sc.nextInt();

                    if (guess > number) {
                        System.out.println("Lower number, please.");
                    } else if (guess < number) {
                        System.out.println("Higher number, please.");
                    } else {
                        System.out.println("Congratulations! You guessed it right!");
                        score = 11 - attempts; // Calculate score based on the number of attempts
                        totalScore += score;
                        break;
                    }

                    attempts++;
                }

                if (attempts > 10) {
                    System.out.println("\nGame over! You reached the maximum number of attempts.");
                    System.out.println("The correct number was: " + number);
                }

                attempts = 1; // Reset attempts for the next round
            }

            System.out.println("\n=== Game Over ===");
            System.out.println("Total Score: " + totalScore);
        }
    }
}


