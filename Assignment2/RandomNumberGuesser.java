/*Class: CMSC203 CRN3156
 Program: Assignment # 2 
 Instructor: Professor Ahmed Tarek
 Summary of Description: This program plays a game with the user to guess a number. The user has seven attempts to guess a number from 0 to 100 correctly. If the user fails to guess using their seven attempts, then the program will give the user the answer. 
 Due Date: 02/14/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Abdullah Shirzoi
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomNumberGuesser game = new RandomNumberGuesser();
        
        // define the varibales 
        do {
            int guessCount = 1;
            int lowGuess = 0;
            int highGuess = 100;
            int secretNumber = RNG.rand();
            System.out.print("Enter your first guess: \n");
            int guess = scanner.nextInt();
            
            // use while loop to keep the program running
            while (guess != secretNumber && guessCount < 7) {
                if (RNG.inputValidation(guess, lowGuess, highGuess)) {
                    if (guess < secretNumber) {
                    	System.out.print("Number of guesses is " + (guessCount) + " ");
                        System.out.println("\nYour guess is too low.");
                        System.out.print("Enter your next guess between " + (guess) + " and " + (highGuess) + " : \n");
                        lowGuess = guess;
                    } else {
                    	System.out.print("Number of guesses is " + (guessCount) + " ");
                        System.out.println("\nYour guess is too high.");
                        System.out.print("Enter your next guess between " + (guess) + " and " + (highGuess) + " : \n");
                        highGuess = guess;
                    }
                    guessCount++;
                }
                
                guess = scanner.nextInt();
            }
            // if the guess is made correctly let the user know
            if (guess == secretNumber) {
                System.out.println("Congratulations, you guessed correctly!");
            } else {
                System.out.println("Sorry, you didn't guess the number in 7 or fewer tries. The number was " + secretNumber + ".");
            }
            // ask the user if he/she wants to play again
            System.out.print("Try again? (Yes or No): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing!");
                break;
            }
        } while (true);
    }
}

class RNG {
	private static int count=0;
	static Scanner scan;
	public RNG() {
		count++;
	}
	
	/**
	 * Sets the count to zero
	 */
	public static void resetCount() {
		count = 0;
	}
	
	/**
	 * generates a random integer between 1 and 100
	 * @return the random number as an integer
	 */
	public static int rand() {
		Random rand = new Random();
		int randInt = rand.nextInt(100)+1;
		return randInt;
	}
	
	/**
	 * Checks that nextGuess is strictly between lowGuess and highGuess
	 * @param nextGuess
	 * @param lowGuess
	 * @param highGuess
	 * @return a boolean, true if the guess is with the bounds, false otherwise
	 */
	public static boolean inputValidation(int nextGuess, int lowGuess, int highGuess) {
		//do {
		boolean rtnValue = true;
		if (nextGuess>=highGuess || nextGuess<=lowGuess) {
				   System.out.println("   >>> Guess must be between "+lowGuess+" and "+highGuess+
						   ".  Try again");				   
				   rtnValue = false;
			   }
		//	} while (nextGuess>=highGuess || nextGuess<=lowGuess);
		count++;
		return rtnValue;
		
	}

	/**
	 * @return an integer, the current value of count
	 */
	public static int getCount() {
		return count;
	}
}