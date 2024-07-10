// This Java application is provided without data, only
// sufficient code to illustrate the points made in 
// chapter 3.
import java.util.Random;
import java.util.Scanner;

public class GuessingGameInefficient {
    public static void main(String[] args) {
        int secretNumber = generateSecretNumber();
        int userGuess;
        boolean correctGuess = false;

        do {
            userGuess = getUserGuess();
            if (userGuess == secretNumber) {
                correctGuess = true;
            } else {
                System.out.println("Try again!");
            }
        } while (!correctGuess);

        System.out.println("You guessed the secret number: " + secretNumber);
    }

    private static int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; 
    }

    private static int getUserGuess() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your guess: ");
            return scanner.nextInt();
        }
    }
    
}
