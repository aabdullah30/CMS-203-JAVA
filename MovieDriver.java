/*
 * CMSC 203
 * Instructor: Ahmed Tarek
 * Student name: Abdullah Shirzoi
 * /
 */

import java.util.Scanner;

public class MovieDriver 
{
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        boolean continueInput = true;
        
        while (continueInput) {
        	
        	// asks the user to enter the movie name
            System.out.print("Enter the name of a movie: ");
            String movieName = input.nextLine();
            
            // asks the user to enter the rating of the movie
            System.out.print("Enter the rating of the movie: ");
            String movieRating = input.nextLine();
            
            // asks the user to enter the sold tickets
            System.out.print("Enter the number of tickets sold for this movie: ");
            int ticketsSold = input.nextInt();
            input.nextLine(); // consume newline character

            MovieDriver movie = new MovieDriver();
            
            // outputs movie name, movie rating, tickets sold
            System.out.printf("%s (%s): Tickets Sold: %d", movieName, movieRating, ticketsSold);
           
            // asks the user if user wants to continue playing with the program. if yes the program should continue if no the program exits
            System.out.print("\nDo you want to enter another? (Yes or No) ");
            String continueResponse = input.nextLine();
            if (!continueResponse.equalsIgnoreCase("Yes")) {
                continueInput = false;
            }
        }
        // program exits after saying no and outputs goodbye
        System.out.println("Goodbye");
    }
}
