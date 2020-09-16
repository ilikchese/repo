package test;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		String title, rating, ynString, yn = "n";
		
		int ticketsSold;
		
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		System.out.print("enter the title of a movie:");
		
		title = keyboard.nextLine();
		
		movie.setTitle(title);
		
		System.out.print("enter the rating of the movie:");
		
		rating = keyboard.nextLine();
		
		movie.setRating(rating);

		System.out.print("enter the tickets sold of the movie:");
		
		ticketsSold = keyboard.nextInt();
		
		movie.setSoldTickets(ticketsSold);
		
		System.out.println( movie.getTitle() + " (" + movie.getRating() + "): Tickets Sold: " + movie.getSoldTickets());
		
		System.out.println("Goodbye");
		
	}

}
