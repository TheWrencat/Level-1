//Paste the code below into 2 classes called Movie and NetflixQueue.
//Create your own class with a main() method that will use Movie and NetflixQueue to complete the following challenges:

	//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.


	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 


public class Netflix{
	
	public static void main(String[] args) {
	Movie MOne = new Movie("Sharknado4", 1);
	Movie MTwo = new Movie("Star Wars", 3);
	Movie MThree = new Movie("Ponyo",5);
	Movie MFour = new Movie("The LEGO Movie", 2);
	Movie MFive = new Movie("The Golden Compass", 4);
	
	NetflixQueue Queue = new NetflixQueue();
	Queue.addMovie(MOne);
	Queue.addMovie(MTwo);
	Queue.addMovie(MThree);
	Queue.addMovie(MFour);
	Queue.addMovie(MFive);
	Queue.sortMoviesByRating(); 
	Queue.printMovies();

	System.out.println("The best movie is.. "+ Queue.getBestMovie());
	System.out.println("The secomd best movie is.. "+ Queue.getMovie(1));
		
	}
	
	
	
}