import java.util.*;
public class numbergussinggame {
    public static void main(String[] args) {
    System.out.println("Welcome to the Number Guessing Game!");
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int) (Math.random() * 100) + 1;
    int userGuess = 0;

    while (userGuess != randomNumber) {
        System.out.print("Enter your guess (1-100): ");
        userGuess = scanner.nextInt();

        if (userGuess < randomNumber) {
            System.out.println("Too low! Try again.");
        } else if (userGuess > randomNumber) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Congratulations! You've guessed the number.");
        }
    }

    scanner.close();
    }
}
