package MovieDB;

import java.util.ArrayList;

public class Director {
	private String director_name;
	private String director_age;
	
	private ArrayList<DirectorMovies> directormovies; // One to many Assosciation

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getDirector_age() {
		return director_age;
	}

	public void setDirector_age(String director_age) {
		this.director_age = director_age;
	}

	public ArrayList<DirectorMovies> getDirectormovies() {
		return directormovies;
	}

	public void setDirectormovies(ArrayList<DirectorMovies> directormovies) {
		this.directormovies = directormovies;
	}
	

	public Director(String director_name, String director_age, ArrayList<DirectorMovies> directormovies) {
		super();
		this.director_name = director_name;
		this.director_age = director_age;
		this.directormovies = directormovies;
	}

	@Override
	public String toString() {
		return "Director [director_name=" + director_name + ", director_age=" + director_age + ", directormovies="
				+ directormovies + "]";
	}
	
	
	
	

}
