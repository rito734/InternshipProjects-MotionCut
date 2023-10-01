import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;    
        int upperBound = 100;  
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number within the specified range.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly.");
                System.out.println("Number of attempts: " + numberOfAttempts);
            }
        }
        scanner.close();
    }
}
