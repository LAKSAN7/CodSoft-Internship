import java.util.Random;
import java.util.Scanner;

public class game1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean play = true;
        int totalScore = 0;
        while (play) {
            int numberToGuess = random.nextInt(100) + 1;
            int Attempts = 10;
            boolean GuessedCorrectly = false;

            for (int i = 1; i <= Attempts; i++) {
                System.out.print("Attempt " + i + ": Enter the Number: ");
                int Guess = scanner.nextInt();

                if (Guess == numberToGuess) {
                    System.out.println("Congratulations!");
                    totalScore += (Attempts - i + 1);
                    GuessedCorrectly = true;
                    break;
                } else if (Guess > numberToGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }

            if (!GuessedCorrectly) {
                System.out.println("you have used all attempts. The correct number is " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again?: ");
            String response = scanner.next();
            play = response.equalsIgnoreCase("yes");
        }

        System.out.println("Your total score is: " + totalScore);

	}

}
