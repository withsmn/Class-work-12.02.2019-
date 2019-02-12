package MovieDB;

import java.util.ArrayList;

import bookassociation.Author;

public class MainMovie {

	public static void main(String[] args) {
		
		// Movie Cast Information		
		ArrayList<MovieCast> moviecasts = new ArrayList<>();
		moviecasts.add(new MovieCast("Abc", "bcd", "jems"));
		moviecasts.add(new MovieCast("xyz", "hjk", "adam"));
		
		// Director class
		// DirectorMovie class
		ArrayList<DirectorMovies> directormovie = new ArrayList<>();
		directormovie.add(new DirectorMovies("life of pie", "2015"));
		directormovie.add(new DirectorMovies("Story of my life", "2018"));
		
		
		ArrayList<Director> director = new ArrayList<>();
		director.add(new Director("adam", "48", directormovie));
		director.add(new Director("smith", "52", directormovie));
		// main Movie Class
		Movie movie = new Movie("Iron Man", "180K", "2020", moviecasts, director);
		System.out.println(movie);
		//System.out.println(movie.getMoviecasts().get(0).getMovie_villen());
		//System.out.println(moviecasts);
		
		
		
		
		
		
		
	}

}
