package MovieDB;

import java.util.ArrayList;

import bookassociation.Author;

public class Movie {
	private String movie_name;
	private String movie_budget;
	private String release_year;
	
	private ArrayList<MovieCast> moviecasts; // 1 to many association
	private ArrayList<Director> director; // 1 to many association
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_budget() {
		return movie_budget;
	}
	public void setMovie_budget(String movie_budget) {
		this.movie_budget = movie_budget;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public ArrayList<MovieCast> getMoviecasts() {
		return moviecasts;
	}
	public void setMoviecasts(ArrayList<MovieCast> moviecasts) {
		this.moviecasts = moviecasts;
	}
	public ArrayList<Director> getDirector() {
		return director;
	}
	public void setDirector(ArrayList<Director> director) {
		this.director = director;
	}
	
	//===================================================================
	public Movie(String movie_name, String movie_budget, String release_year, ArrayList<MovieCast> moviecasts,
			ArrayList<Director> director) {
		super();
		this.movie_name = movie_name;
		this.movie_budget = movie_budget;
		this.release_year = release_year;
		this.moviecasts = moviecasts;
		this.director = director;
	}
	
	// ====================================================================
	
	@Override
	public String toString() {
		return "Movie [movie_name=" + movie_name + ", movie_budget=" + movie_budget + ", release_year=" + release_year
				+ ", moviecasts=" + moviecasts + ", director=" + director + "]";
	}

	
	
	
	
	
	

}
	