package bookassociation;

import java.util.ArrayList;

public class Book {
	private String name;
	private int price;
	private String edition;
	
	//private Author author; // 1 to 1 association
	private Publisher publisher; // 1 to 1 association
	private ArrayList<Author> authors; // 1 to many association
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	
	
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	

	public Book(String name, int price, String edition) {
		super();
		this.name = name;
		this.price = price;
		this.edition = edition;
		
	}
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", edition=" + edition + ", publisher=" + publisher
				+ ", authors=" + authors + "]";
	}
	
	
	
	
	
	
	
	
	
}
