package bookassociation;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Thinking fast and slow", 1205, "3rd");
		
		Author author = new Author("Sajeeb", 2315236, "Email@email.com");
		
		
		
		ArrayList<Author> authors = new ArrayList<>();
		authors.add(new Author("sam", 1253245, "myewmial@mail.com"));
		authors.add(new Author("David", 1253245, "myewmial@mail.com"));
		authors.add(new Author("smith", 1253245, "myewmial@mail.com"));
		
		book.setAuthors(authors);
		
		for(Author a : book.getAuthors()){
			System.out.println(a.getName());
		}
		
		
		Publisher publisher = new Publisher("sam", 236521);
		book.setPublisher(publisher);
		
		Address address = new Address("My house", 1205, 1207, "My street");
		
		System.out.println(book);
		
		
			
	}

}
