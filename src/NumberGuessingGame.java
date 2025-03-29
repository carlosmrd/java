import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner =  new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d.\n", min ,max);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber){
                System.out.println("Too low, try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Correct! The number was " + randomNumber + ".");
                System.out.println("You guessed it in " + attempts + " tries.");
                break;
            }
        } while (guess != randomNumber);



        scanner.close();
    }
}
