package MovieDB;

public class DirectorMovies {
	private String movie_list;
	private String release_year;
	
	
	public String getMovie_list() {
		return movie_list;
	}
	public void setMovie_list(String movie_list) {
		this.movie_list = movie_list;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	
	public DirectorMovies(String movie_list, String release_year) {
		super();
		this.movie_list = movie_list;
		this.release_year = release_year;
	}
	
	@Override
	public String toString() {
		return "DirectorMovies [movie_list=" + movie_list + ", release_year=" + release_year + "]";
	}
	
	
	

}
