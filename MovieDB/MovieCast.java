package MovieDB;

public class MovieCast {
	private String movie_actor;
	private String movie_actress;
	private String movie_villen;
	
	
	public MovieCast(String movie_actor, String movie_actress, String movie_villen) {
		super();
		this.movie_actor = movie_actor;
		this.movie_actress = movie_actress;
		this.movie_villen = movie_villen;
	}
	
	


	public String getMovie_actor() {
		return movie_actor;
	}




	public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}




	public String getMovie_actress() {
		return movie_actress;
	}




	public void setMovie_actress(String movie_actress) {
		this.movie_actress = movie_actress;
	}




	public String getMovie_villen() {
		return movie_villen;
	}




	public void setMovie_villen(String movie_villen) {
		this.movie_villen = movie_villen;
	}




	@Override
	public String toString() {
		return "MovieCast [movie_actor=" + movie_actor + ", movie_actress=" + movie_actress + ", movie_villen="
				+ movie_villen + "]";
	}
	

	
}
