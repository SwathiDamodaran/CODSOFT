package task1;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	      System.out.println("******Welcome******");
	   	 System.out.println(" select a number between 1 and 100.");
	        int score = 0;
	        boolean playAgain = true;

	        while (playAgain) {
	            int target = random.nextInt(100) + 1;
	            int attempts = 0;
	            int maxAttempts = 5;


	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int Guess = scanner.nextInt();
	                scanner.nextLine();
	                attempts++;

	                if (Guess == target) {
	                    System.out.println("Congratulations You Won the game.");
	                    score++;
	                } else if (Guess < target) {
	                    System.out.println("Too low! ");
	                } else {
	                    System.out.println("Too high! ");
	                }
	            }

	            if (attempts >= maxAttempts) {
	                System.out.println("Sorry, you've reached maximum number of attempts. ");
	                System.out.println(" correct number : " + target );
	            }
	        }
	}
}


