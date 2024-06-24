// This Java application is provided without data, only
// sufficient code to illustrate the points made in 
// chapter 3.
import java.util.Random;
import java.util.Scanner;

public class GuessingGameEfficient {
    public static void main(String[] args) {
        int secretNumber = generateSecretNumber();
        int userGuess;

        do {
            userGuess = getUserGuess();
            if (userGuess != secretNumber) {
                System.out.println("Try again!");
            }
        } while (userGuess != secretNumber);

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
