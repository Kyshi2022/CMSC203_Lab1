import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner (System.in); //Scanner object created in order to receive inputs from the user
		String movieTitle; //String object for the user to input any movie title
		String movieRating; //String object for the user to input the movie's ratings
		int ticketsSold; //An int object for the user to input the number of tickers sold for the movie
		Movie m = new Movie(); //A new movie object initialized
		int loop = 1; //An int variable to check if the program continues on the while loop or not, 0 & 1 are the only values associated with this variable
		String response; //String object for the user to respond in either "y" or "n" if they want to add in another movie or not
		
		while (loop == 1) { //This while loop keeps running if the user decides to add another movie
			
			//Program asks the user for the movie title, user enters in the movie title, and then the program stores the user's input in the Movie object
			System.out.println("Enter the name of a movie: ");
			movieTitle = keyboard.nextLine();
			m.setTitle(movieTitle);
			
			//Program asks the user for the movie rating, user enters in the movie rating, and then the program stores the user's input in the Movie object
			System.out.println("Enter the rating of the movie: ");
			movieRating = keyboard.nextLine();
			m.setRating(movieRating);
			
			//Program asks the user for the number of tickets sold, user enters in the number of tickets sold, and then the program stores the user's input in the Movie object
			System.out.println("Enter the number of tickets sold for this movie: ");
			ticketsSold = keyboard.nextInt();
			m.setSoldTickets(ticketsSold);
			
			//This statement will print all of m's attributes with the toString method to the Movie class
			System.out.println(m.toString());
			
			//Program asks the user if they want to add in another movie, the loop will stop and then print an output statement if the user no longer wishes to add in more movies
			System.out.println("Would you like to enter in another movie? (y or n): ");
			keyboard.nextLine();
			response = keyboard.nextLine();
			
			if (response.equals("n")) {
				loop = 0;
			}
		}
		
		System.out.println("Have a nice day!!!");
	}
}